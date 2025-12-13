pipeline {
    agent any

    tools {
        jdk 'JDK17'
        maven 'Maven'
    }

    environment {
        // JAVA_HOME = '/usr/lib/jvm/java-17-openjdk-amd64'
        // MAVEN_HOME = '/usr/share/maven'
        // PATH = "${JAVA_HOME}/bin:${MAVEN_HOME}/bin:${env.PATH}"

        GIT_CREDS      = credentials('github-aya-creds')
        SONAR_TOKEN    = credentials('Sonar-token')
        SONAR_HOST_URL = "http://localhost:9000"
    }

    stages {

        stage('Checkout') {
            steps {
                git url: 'https://github.com/ayaigadern/Hospital-Management-System.git',
                    credentialsId: 'github-aya-creds',
                    branch: 'master'
            }
        }

        stage('Check Java & Maven') {
            steps {
                sh 'java -version'
                sh 'javac -version'
                sh 'mvn -version'
            }
        }

        stage('Build & Test') {
            steps {
                sh 'mvn clean verify -DskipTests=false'
            }
        }

        stage('SonarQube Analysis') {
            steps {
                withSonarQubeEnv('SonarQube') {
                    sh """
                        mvn sonar:sonar \
                          -Dsonar.projectKey=Hospital-Management-System \
                          -Dsonar.host.url=$SONAR_HOST_URL \
                          -Dsonar.login=$SONAR_TOKEN \
                          -Dsonar.java.binaries=target/classes \
                          -Dsonar.coverage.jacoco.xmlReportPaths=target/jacoco-report/jacoco.xml
                    """
                }
            }
        }

        stage('Debug Java Version') {
            steps {
                sh '''
                    echo "JAVA_HOME: $JAVA_HOME"
                    $JAVA_HOME/bin/java -version
                    which java
                    java -version
                '''
            }
        }

        stage('Debug Maven') {
            steps {
                sh 'echo $PATH'
                sh 'mvn -version'
            }
        }

        stage('Archive Artifacts') {
            steps {
                archiveArtifacts artifacts: 'target/*.war', fingerprint: true
            }
        }
        stage('Deploy to Kubernetes') {
    steps {
        sh '''
            kubectl apply -f Kubernetes/deployment.yaml
            kubectl apply -f Kubernetes/service.yaml
            kubectl rollout restart deployment hospital-management-system
        '''
    }
}

    }

    post {
        always {
            junit 'target/surefire-reports/*.xml'
        }
    }
}


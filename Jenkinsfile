pipeline {
    agent any

    tools {
        jdk 'JDK17'
        maven 'Maven'
    }

    environment {
    JAVA_HOME = tool(name: 'JDK17', type: 'jdk')
    MAVEN_HOME = tool(name: 'Maven', type: 'maven')
    PATH = "${JAVA_HOME}/bin:${MAVEN_HOME}/bin:${env.PATH}"

    GIT_CREDS = credentials('github-aya-creds')
    SONAR_TOKEN = credentials('Sonar-token')
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
                -Dsonar.projectKey=com.mycompany:HospitalSystemV2 \
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

        stage('Archive Artifacts') {
            steps {
                archiveArtifacts artifacts: 'target/*.war', fingerprint: true
            }
        }
    }

    post {
        always {
            junit 'target/surefire-reports/*.xml'
        }
    }
}
//test

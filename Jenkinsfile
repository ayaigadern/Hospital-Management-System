pipeline {
    agent any

    environment {
        // GitHub credentials ID in Jenkins
        GIT_CREDS = credentials('github-aya-creds')
        // SonarQube token stored as secret text in Jenkins
        SONAR_TOKEN = credentials('sonar-token')
    }

    stages {
        stage('Checkout') {
            steps {
                git url: 'https://github.com/ayaigadern/Hospital-Management-System.git',
                    credentialsId: 'github-aya-creds',
                    branch: 'master'
            }
        }

        stage('Build') {
            steps {
                // Run Maven build
                sh 'mvn clean package'
            }
        }

        stage('Test') {
            steps {
                // Run Maven tests
                sh 'mvn test'
            }
        }

        stage('SonarQube Analysis') {
            steps {
                // Use SonarQube environment configured in Jenkins
                withSonarQubeEnv('SonarQube') {
                    sh """
                    mvn sonar:sonar \
                    -Dsonar.projectKey=Hospital-Management-System \
                    -Dsonar.host.url=$SONAR_HOST_URL \
                    -Dsonar.login=$SONAR_TOKEN \
                    -Dsonar.java.binaries=target/classes
                    """
                }
            }
        }

        stage('Archive Artifacts') {
            steps {
                // Archive the generated WAR files
                archiveArtifacts artifacts: 'target/*.war', fingerprint: true
            }
        }
    }

    post {
        always {
            // Publish JUnit test results
            junit 'target/surefire-reports/*.xml'
        }
    }
}

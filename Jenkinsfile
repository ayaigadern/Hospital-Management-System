pipeline {
    agent any

    environment {
        // Replace with the ID of your GitHub credentials in Jenkins
        GIT_CREDS = credentials('github-aya-creds')
    }

    stages {
        stage('Checkout') {
            steps {
                git url: 'https://github.com/ayaigadern/Hospital-Management-System.git',
                    credentialsId: 'github-aya-creds'
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

        stage('Archive Artifacts') {
            steps {
                // Archive the generated JAR/WAR files
                archiveArtifacts artifacts: 'target/*.war', fingerprint: true

            }
        }
    }
}

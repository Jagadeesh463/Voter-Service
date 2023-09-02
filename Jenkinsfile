pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }
        stage('Clean') {
            steps {
                sh 'mvn clean' // Clean the project (Maven example)
                // You can use equivalent commands for other build tools (e.g., gradle clean)
            }
        }
        stage('Compile') {
            steps {
                sh 'mvn compile' // Compile the project (Maven example)
                // You can use equivalent commands for other build tools (e.g., gradle build)
            }
        }
    }

    post {
        success {
            echo 'Build successful!'
        }
        failure {
            echo 'Build failed!'
        }
    }
}

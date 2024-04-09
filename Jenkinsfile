pipeline {
    agent any
    
    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/subha130604/sample.git'
            }
        }
         stage('Build') {
            steps {
                dir('D:/maven/my-app') {
                    bat 'mvn clean install'
                }
            }
        }
        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }
        // Add more stages as needed
    }
}

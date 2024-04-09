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
                    bat 'mvn clean package'
                }
            }
        }
        stage('Test') {
            steps {
                bat 'mvn clean test'
            }
        }
        stage('Run') { 
            steps {
                bat 'java -cp target/classes com.mycompany.app.App'
            }
        }
        // Add more stages as needed
    }
}

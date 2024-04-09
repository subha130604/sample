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
			bat 'javac -cp target/classes src/main/java/com/mycompany/app/*.java'
                }
            }
        }
       
        
        stage('Run') { 
            steps {
	    dir('D:/maven/my-app'){
                bat "java -cp target/classes com.mycompany.app.App 5"
            }
	    }
        }
        // Add more stages as needed
    }
}

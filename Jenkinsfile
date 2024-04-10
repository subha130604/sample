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
			bat 'mvn compile'
                    bat 'mvn package'
			
                }
            }
        }
	    stage('Test'){
		    steps{
			    dir('D:/maven/my-app') {
			    bat 'mvn test'
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

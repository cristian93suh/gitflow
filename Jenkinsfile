pipeline {
    agent any 
    
    tools{
        jdk 'jdk11'
        maven 'maven'
    }
    
    
    stages{
        
        stage("Git Checkout"){
            steps{
               
                git branch: 'develop', credentialsId: 'e2b759ab-197c-4250-b2fd-0f99b49c1d74', url: 'https://github.com/cristian93suh/gitflow.git'
            }
        }
        
        stage("Compile"){
            steps{
                sh "mvn clean compile"
            }
        }
        
         stage("Test Cases"){
            steps{
                sh "mvn test"
            }
        }
        
        
        
        
         stage("Build"){
            steps{
                sh " mvn clean install"
            }
        }
        
        
    }
}

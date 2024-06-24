properties([
	parameters([
		choice(choices: ['-', 'feature-start', 'release-start', 'release-direct'], description: 'start feature or start release. Release-directly builds develop but acts as a release branch!! Build only if not set', name: 'gitflow_action_param'), 
		choice(choices: ['-'], description: '''feature name in case feature-start action selected''', name: 'feature_name'), 
		choice(choices: ['No', 'Yes'], description: '''Deploy on \'uat\'? ( \'uat\' if release-direct )''', name: 'DEPLOY')])])

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
        
       
        
        
    }
}

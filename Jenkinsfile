properties([
		parameters([
			 string(defaultValue: "-",description: 'Slack command',name: 'command'),
			 string(defaultValue: "-",description: 'Remote trigger',name: 'cause'),
			 booleanParam(defaultValue: false, description: 'Wipe Workspace', name: 'cleanWorkspace'),
			 choice(name: 'DRY_RUN', choices:"No\nYes", description: "Do you whish to do a dry run to grab parameters?" ),
			 choice(choices: "${env.GITFLOW_ACTIONS}", description: "${env.GITFLOW_ACTIONS_DESC}", name: 'gitflow_action_param'),
			 string(defaultValue: "${env.FEATURE_NAME}",description: 'feature name in case feature-start action selected',name: 'feature_name', trim: true),
			 choice(name: 'DEPLOY', choices:"No\nYes", description: "Deploy on '${DEPLOYMENT_ENV}'? ( '${DEPLOYMENT_ENV_REL_DIRECT}' if release-direct )"),
			 


            
        ])


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

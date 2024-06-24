jte{
	pipeline_template = "Jenkinsfile_gitflow_docker"
}

@merge libraries{	
	@override basictools{
		maventool = "maven"
		jdktool = 'jdk11'
		pom_use_revision = false
		sonarqube = false
		junit_save = true
		nodetool = "Node16"
	}
	
	@merge parametrizing {
		@override branchtype_deployenv {
			dev = "dockerdev"
			release = "uat"
			master = "pro"
			hotfix = "pro"
		}
	}
}

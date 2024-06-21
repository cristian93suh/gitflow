pipeline_template = "Jenkinsfile_gitflow_docker"

libraries{
	basictools{
		maventool = "maven 3.6"
		jdktool = 'jdk11-corretto'
		pom_use_revision = true
		sonarqube = false
		junit_save = false
	}
	parametrizing {
		override = true
		branchtype_deployenv {
			dev = "develop"
			release = "release"
			master = "master"
			hotfix = "hotfix"
		}
	}
  utilities{ }}

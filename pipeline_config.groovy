jte{
	pipeline_template = "Jenkinsfile_gitflow_docker"
	permissive_initialization = True
	reverse_library_resolution = True
	allow_scm_jenkinsfile = False
	
}

@merge libraries{	
	@override basictools{
		maventool = "maven"
		jdktool = 'jdk11'
	}
	
	@merge parametrizing {
		@override branchtype_deployenv {
			dev = "develop"
			release = "release"
			master = "master"
			hotfix = "hotfix"
		}
	}
}

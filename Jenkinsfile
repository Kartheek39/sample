pipeline{
    agent any
    environment{
        name = "kartheek"
    }
    parameters {
	   gitParameter(
		    branch: '',
		    branchFilter: 'origin/(.*)',
		    defaultValue: 'master',
		    description: 'Default branch : "gms_staging"\nOR\nChoose the "BRANCH_NAME" from above list',
		    name: 'BRANCH_NAME',
		    quickFilterEnabled: false,
		    selectedValue: 'NONE',
		    sortMode: 'NONE',
		    tagFilter: '*',
		    type: 'PT_BRANCH')
    }
    stages{
        stage('stage1'){
            steps{
                script{
                    load "./env.groovy"
                    echo "$name"
                }
            }
        }
        stage('stage2'){
            steps{
                echo "$name"
                echo "${env.BUILD_NUMBER}"
                echo "${env.WORKSPACE}"
                echo "${env.BRANCH_NAME}"
            }
        }
        stage('stage3') {
            when {
                branch 'main'
            }
            steps {
                echo "deployment done"
            }
        }
    }
}

pipeline{
    agent any
    environment{
        name = "kartheek"
       // Email Recipints
	DEFAULT_RECIPIENTS= 'bkartheekreddy39@gmail.com'
	ALLWAYS_RECIPIENTS= 'bkartheekreddy39@gmail.com'
    }
    /*parameters {
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
    }*/
    parameters {
      gitParameter branchFilter: 'origin/(.*)', defaultValue: 'master', name: 'BRANCH', type: 'PT_BRANCH'
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
    post {
        always {
            mail bcc: '', body: "<b>BUILD_DETAILS </b><br>Project: ${env.JOB_NAME} <br>Build Number: ${env.BUILD_NUMBER} <br> URL de build: ${env.BUILD_URL}", cc: '', charset: 'UTF-8', from: '', mimeType: 'text/html', replyTo: '', subject: "BUILD STATUS in Jenkins: Project name -> ${env.JOB_NAME}", to: "$ALLWAYS_RECIPIENTS";
        }
	    failure {  
            mail bcc: '', body: "<b>BUILD_DETAILS </b><br>Project: ${env.JOB_NAME} <br>Build Number: ${env.BUILD_NUMBER} <br> URL de build: ${env.BUILD_URL}", cc: '', charset: 'UTF-8', from: '', mimeType: 'text/html', replyTo: '', subject: "BUILD FAILED in Jenkins: Project name -> ${env.JOB_NAME}", to: "$DEFAULT_RECIPIENTS";  
        }  
        unstable {  
            echo 'This will run only if the run was marked as unstable'  
        }  
        changed {  
            echo 'This will run only if the run was marked as changed'   
        }
	}
}

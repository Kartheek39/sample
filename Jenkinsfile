pipeline{
    agent any
    environment{
        name= "kartheek"
        url= ""
        id= 39
    }
    stages{
        stage('stage1'){
            steps{
                script{
                    load "./env.groovy"
                    echo "{$name}"
                }
            }
        }
        stage('stage2'){
            steps{
                echo "{$env.url}"
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
        stage('stage4') {
            if (env.BRANCH_NAME == 'master') {
                echo 'I only execute on the master branch'
            } else {
                echo 'I execute elsewhere'
            }
        }
    }
}

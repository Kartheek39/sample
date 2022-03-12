pipeline{
    agent any
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
    }
}

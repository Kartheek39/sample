pipeline{
    agent any
    environment{
        name = "kartheek"
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

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
            }
        }
        stage('stage3'){
            when{
                branch 'main'
            }
            steps{
                echo "deployment done"
            }
        }
    }
}

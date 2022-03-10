pipeline{
    agent any
    environment{
        name= "kartheek"
        url= "something"
        id= 39
    }
    stages{
        stage('stage1'){
            steps{
                script{
                    load "./env.groovy"
                    echo "{$env.name}"
                }
            }
        }
        stage('stage2'){
            steps{
                echo "{$env.url}"
            }
        }
    }
}

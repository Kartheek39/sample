pipeline{
    agent any
    environment{
        name= "kartheek"
        url= "something"
    }
    stages{
        stage('stage1'){
            steps{
                echo "${env.name}"
            }
        }
        stage('stage2'){
            steps{
                echo "${env.url}"
            }
        }
    }
}

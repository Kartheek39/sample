pipeline{
    agent any
    environment{
        name= "kartheek"
        url= "something"
    }
    stages{
        stage('stage1'){
            steps{
                echo "${name}"
            }
        }
        stage('stage2'){
            steps{
                echo "${url}"
            }
        }
    }
}

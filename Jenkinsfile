pipeline{
    agent any
    environment{
        name= "kartheek"
        id= 39
    }
    stages{
        stage('stage1'){
            steps{
                echo "{$env.name}"
            }
        }
        stage('stage2'){
            steps{
                script {
                    echo "{$env.url}"
                }
            }
        }
    }
}

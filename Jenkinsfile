pipeline {
    agent any

    stages {
        stage('Build') 
        {
            steps 
            {
                echo 'Build Hello World'
            }
        }
         stage('Test') 
        {
            steps 
            {
                echo 'Test Hello World'
            }
        }
         stage('Deploy') 
        {
            steps 
            {
                echo 'Deploy Hello World'
            }
        }
    }
    
    post
    {
        always
        {
            emailext body: 'summary', subject: 'Pipeline status', to: 'deepaknikhad28@gmail.com'
        }
    }


    
}

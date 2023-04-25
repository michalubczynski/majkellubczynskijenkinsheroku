pipeline {
    agent any

    tools {
        // Install the Maven version configured as "M3" and add it to the path.
        maven "M3"
    }

    stages {
        stage('Build') {
            steps {
                sh "mvn clean compile"
            }
        }
        stage('Test'){
            steps{
                sg "mvn test"
            }
        }
        stage('Deploy'){
            steps{
                sg "mvn heroku:deploy"
            }
        }
    }
}
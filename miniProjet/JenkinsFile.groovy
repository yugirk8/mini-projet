pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                git 'https://github.com/yugirk8/mini-projet.git'
                echo 'Building Project ..'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing...'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying...'
            }
        }
    }
}
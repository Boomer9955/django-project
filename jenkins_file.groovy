pipeline {
    agent {
        docker { image 'node:boomer9955/django' }
    }
    stages {
        stage('Test') {
            steps {
                sh 'node --version'
            }
        }
    }
}

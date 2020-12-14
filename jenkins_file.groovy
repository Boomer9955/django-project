pipeline {
    agent {
        docker { image 'node:boomer9955' }
    }
    stages {
        stage('Test') {
            steps {
                sh 'node --version'
            }
        }
    }
}

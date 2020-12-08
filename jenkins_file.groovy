pipeline {
    agent any
    stages {
        stage('minikube') {
            steps { script {
                sh 'ifconfig'
                //new sh
                sh 'ipconfig'
            }}
        }
    }
}
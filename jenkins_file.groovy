#!groovy
// Run docker build
properties([disableConcurrentBuilds()])

pipeline {
    agent any
    
    stages {
        stage('create docker image') {
            steps {
                echo "------Start Build------"
                dir ('docker'){
                    sh 'docker build .'
                }
            }
        }
    }
}

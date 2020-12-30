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
                    sh 'yum-config-manager --add-repo https://download.docker.com/linux/centos/docker-ce.repo'
                    sh 'yum install docker-ce'
                    sh 'systemctl start docker'
                    sh 'docker run hello-world'
                }
            }
        }
    }
}

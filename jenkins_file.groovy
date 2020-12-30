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
                    sh 'sudo yum-config-manager \ --add-repo \ https://download.docker.com/linux/centos/docker-ce.repo'
                    sh 'sudo yum install docker-ce'
                    sh 'sudo systemctl start docker'
                    sh 'sudo docker run hello-world'
                }
            }
        }
    }
}

#!groovy
// Run docker build
properties([disableConcurrentBuilds()])

pipeline {
    agent any
    
    stages {
        stage('docker image') {
            steps {
                echo "------Start Build------"
                    def dockerHome = tool 'docker'
                    def mavenHome  = tool 'Maven'
                    env.PATH = "${dockerHome}/bin:${mavenHome}/bin:${env.PATH}"
                    sh "docker version"
               
            }
        }
    }
}

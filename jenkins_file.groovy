#!groovy
// Run docker build
properties([disableConcurrentBuilds()])

pipeline {
    agent any
    
    stages{
        stage('Initialize')
        {
            def dockerHome = tool 'docker'
            def mavenHome  = tool 'Maven'
            env.PATH = "${dockerHome}/bin:${mavenHome}/bin:${env.PATH}"
        }
    }
    
    stages {
        stage('create docker image') {
            steps {
                echo "------Start Build------"
                    sh "docker version"
               
            }
        }
    }
}

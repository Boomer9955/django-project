pipeline {
    agent any

    stages{
        
        stage('Cloning our Git') { 

                steps { 

                    checkout scm

                }   

            } 

        stage('Building our image') { 

            steps { 

                script { 
                    dir("ansible") {
                        sh "pwd"
                        sh "ls"
                        String ip = 'grep -E -o "([0-9]{1,3}[\\.]){3}[0-9]{1,3}" hosts.yml'
                        sh "curl http://${ip}:8080"
                    }

                }

            }

        }
   
    }

}

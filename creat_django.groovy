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
                        def ip = sh 'grep -E -o "([0-9]{1,3}[\\.]){3}[0-9]{1,3}" hosts.yml'
                        println "${ip}"
                    }

                }

            }

        }
   
    }

}

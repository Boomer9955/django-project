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
                        sh "cat hosts.yml"
                    }

                }

            }

        }
   
    }

}

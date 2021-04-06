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
                    dir("django") {
                        sh "pwd"
                        println ansible/hosts.yml['ansible_host'][0]
                    }

                }

            }

        }
   
    }

}
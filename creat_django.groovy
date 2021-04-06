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
                        sh "ls"
                        println ansible/hosts.yml['ansible_host'][0]
                    }

                }

            }

        }
   
    }

}

pipeline {
    agent any

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
                    println hosts.yml['ansible_host'][0]
                }

            }

        }

    }
}
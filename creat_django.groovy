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

<<<<<<< HEAD
=======
            script { 
                dir("django") {
                    sh "pwd"
                    println ansible/hosts.yml['ansible_host'][0]
>>>>>>> 4748d7c9d5e87e01360503c4c782bdf3cd94f354
                }

            }

        }
   
    }
<<<<<<< HEAD

}
=======
}
>>>>>>> 4748d7c9d5e87e01360503c4c782bdf3cd94f354

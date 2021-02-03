pipeline { 

    environment { 

        registry = "boomer9955/mydjango" 

        registryCredential = 'dockerhub_id' 

        dockerImage = '' 

    }

    agent any 

    stages { 

        stage('Cloning our Git') { 

            steps { 

                checkout scm

            }

        } 

        stage('Building our image') { 

            steps { 

                script { 
                    dir("docker") {
                        sh "pwd"
                        dockerImage = docker.build registry + ":latest" 
                    }

                }

            } 

        }

        stage('Deploy our image') { 

            steps { 

                script { 

                    docker.withRegistry( '', registryCredential ) { 

                        dockerImage.push() 

                    }

                } 

            }

        } 

        stage('Cleaning up') { 

            steps { 

                sh "docker rmi $registry:latest" 

            }

        } 

    }

}
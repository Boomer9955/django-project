pipeline {
    agent any

    stages {
        stage('creature docker_file') {
            steps {
                echo 'Hello World'
            }
        }
    }
}
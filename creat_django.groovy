env.registry = "boomer9955/mydjango"
env.registryCredential = "dockerhub_id"
env.dockerImage=""

node{
    stage('копируем репу'){
        checkout scm
    }
    stage('собираем image'){
        withCredentials([file(credentialsId: 'docker_hub', variable: 'password')]) {
            sh "ansible-vault decrypt --vault-password-file {$password} ansible/password.conf"
            sh "cat ansible/password.conf"
            //dockerImage = docker.build registry + ":latest"
        }
    }
}

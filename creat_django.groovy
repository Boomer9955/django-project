env.registry = "boomer9955/mydjango"
env.registryCredential = "dockerhub_id"
env.dockerImage=""

node{
    stage('копируем репу'){
        checkout scm
    }
    stage('собираем image'){
        withCredentials([string(credentialsId: 'dockerhub', variable: 'password')]) {
            writeFile file: 'token.txt', text: "$password"
            sh "ansible-vault decrypt --vault-password-file {$password} ansible/password.conf"
            sh "cat ansible/password.conf"
            sh "rm token.txt"
            //dockerImage = docker.build registry + ":latest"
        }
    }
}

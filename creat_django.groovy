env.registry = "boomer9955/mydjango"
env.registryCredential = "dockerhub_id"
env.dockerImage=""

node{
    stage('копируем репу'){
        checkout scm
    }
    stage('собираем image'){
        withCredentials([string(credentialsId: 'dockerhub', variable: 'password')]) {
            writeFile file: 'jenkins.conf', text: "$password"
            sh "ansible-vault decrypt --vault-password-file jenkins.conf ansible/password.conf"
            sh "cat ansible/passwor.conf"
            //dockerImage = docker.build registry + ":latest"
        }
    }
}

env.registry = "boomer9955/mydjango"
env.registryCredential = "dockerhub_id"
env.dockerImage=""

node{
    stage('копируем репу'){
        checkout scm
    }
    stage('собираем image'){
        curDate = readFile '/Users/yurkin-rv/Documents/django-project/ansible/log.yml'
        println "${curDate}"
        def mb = (curDate =~ "\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}")
                ip = mb[0]
            println "${ip}"
            //sh "ansible-vault decrypt --vault-password-file {$password} ansible/password.conf"
            //dockerImage = docker.build registry + ":latest"
    }
}

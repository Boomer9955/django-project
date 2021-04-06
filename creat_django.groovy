node {
    checkout scm
    def hosts = ansible/hosts.yml
    sh "pwd"
    sh "ls"
    def ip = sh 'grep -E -o "([0-9]{1,3}[\\.]){3}[0-9]{1,3}" ${hosts}'
    println "${ip}"
    sh "curl http://${ip}:8080"
}

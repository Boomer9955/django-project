node {
    checkout scm
    sh "pwd"
    sh "ls"
    def ip = sh 'grep -E -o "([0-9]{1,3}[\\.]){3}[0-9]{1,3}" hosts.yml'
    println "${ip}"
    sh "curl http://${ip}:8080"
}

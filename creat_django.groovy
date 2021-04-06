node {
    checkout scm
    sh "pwd"
    sh "ls"
    def ip = sh 'grep -E -o "([0-9]{1,3}[\\.]){3}[0-9]{1,3}" ansible/hosts.yml'
    String host = ip.toString()
    println "${host}"
    sh "curl http://${host}:8080"
}

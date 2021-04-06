node {
    checkout scm

    curDate = readFile 'ansible/hosts.yml'

    def mb = (curDate =~ "\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}")
        ip = mb[0]
        println "${ip}"
    sh 'curl http://${ip}:8000'
}

node {
    checkout scm

    curDate = readFile 'ansible/hosts.yml'

    def mb = (curDate =~ "\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}")
        ip = mb[0]
        println "${ip}"
    def res = sh(script: 'curl --insecure -u nnarayan1 http://${ip}:8000', returnStdout: true)
}

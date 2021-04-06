node {
    checkout scm

    curDate = readFile 'ansible/hosts.yml'

    def mb = (curDate =~ "\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}")
        println mb[0]
}

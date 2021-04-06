node {
    checkout scm
    curDate = readFile 'ansible/hosts.yml'
    def mb = (curDate =~ [0-9])
        println mb[0]
}

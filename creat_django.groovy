node {
    checkout scm

    curDate = readFile 'ansible/hosts.yml'

    def mb = (curDate =~ (?:\d+\.){3}\d+))
        println mb[0]
}

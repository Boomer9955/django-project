node {
    checkout scm
    curDate = readFile 'ansible/hosts.yml'
    def mb = (curDate =~ /#(\d+)/)
        println mb[0][1]
}

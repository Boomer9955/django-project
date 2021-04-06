node {
    checkout scm
    curDate = readFile 'ansible/hosts.yml'
    def mb = (curDate =~ /#(\d+)/)
        println mc[0][1]
}

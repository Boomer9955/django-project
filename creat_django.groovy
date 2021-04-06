node {
    checkout scm
    curDate = readFile 'ansible/hosts.yml'
    def match = curDate =~ '([0-9]{1,3}[\\.]){3}[0-9]{1,3}'
        println match[0]
}

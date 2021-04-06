node {
    checkout scm
    curDate = readFile 'ansible/hosts.yml'
    def match = curDate =~ 'ansible_host'
     echo "${match}"
}

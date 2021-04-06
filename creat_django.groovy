node {
    checkout scm
    curDate = readFile 'ansible/hosts.yml'
    def match = url =~ 'ansible_host'
     echo "${match}"
}

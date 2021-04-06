node {
    checkout scm
    curDate = readFile 'ansible/hosts.yml'
    echo "${curDate}"
}

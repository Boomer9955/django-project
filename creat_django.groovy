node {
    checkout scm
    new File('ansible/hosts.yml').eachLine {
        println it
    }
}

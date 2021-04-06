node {
    checkout scm
    def file = new File('ansible/hosts.yml')
    def yourData = file.eachLine { line ->
        println line }
}

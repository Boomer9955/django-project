node {
    checkout scm
    sh "pwd"
    sh "ls"
    ip = sh 'grep -E -o "([0-9]{1,3}[\\.]){3}[0-9]{1,3}" ansible/hosts.yml'
    groovyString = "${ip}"
    bigGroovyString = """${groovyString}"""
    println bigGroovyString
}

node {
    checkout scm

    curDate = readFile 'ansible/hosts.yml'
    def read = readYaml file: curDate
    
    /*def mb = (curDate =~ "\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}")
        ip = mb[0]
        println "${ip}"
    sh 'curl http://${ip}:8000'*/
    def amap = ['something': 'my datas',
                    'size': 3,
                    'isEmpty': false]

    writeYaml file: curDate, data: amap
    def read = readYaml file: curDate
    println "${read}"
}

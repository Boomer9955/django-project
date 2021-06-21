#!/usr/bin/env groovy

import org.yaml.snakeyaml.Yaml
import groovy.*
//env.registry="boomer9955/mydjango"
//env.registryCredential="dockerhub_id"
//env.dockerImage=""

node {

    checkout scm

    curDate = 'ansible/password.conf'
    
    withCredentials([string(credentialsId: 'dockerhub', variable: 'password')]) {
            writeFile file: 'token.txt', text: "$password"
            sh "ansible-vault decrypt --vault-password-file token.txt ${curDate}"
            sh "cat ${curDate}"
            sh "rm token.txt"
    }


    //def read = readYaml file: curDate
    
    /*def mb = (curDate =~ "\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}")
        ip = mb[0]
        println "${ip}"
    sh 'curl http://${ip}:8000'
    def amap = ['something': 'my datas',
                    'size': 3,
                    'isEmpty': false]

    writeYaml file: curDate, data: amap
    def read = readYaml file: curDate
    println "${read}"*/
}

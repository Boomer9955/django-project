#!/usr/bin/env groovy

import org.yaml.snakeyaml.Yaml
import groovy.*
//env.registry="boomer9955/mydjango"
//env.registryCredential="dockerhub_id"
//env.dockerImage=""

node {

    checkout scm

    curDate = 'ansible/password.conf'

    withCredentials([file(credentialsId: 'docker_hub', variable: SFILE)]) {
        sh 'ansible-vault decrypt ${curDate} --vault-password-file ${SFILE}'
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

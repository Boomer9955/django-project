#!/usr/bin/env groovy

import org.yaml.snakeyaml.Yaml
import groovy.yaml.*
import groovy.*
//env.registry="boomer9955/mydjango"
//env.registryCredential="dockerhub_id"
//env.dockerImage=""

node {
    curDate = 'ansible/log.yml'

    stage("git clone"){
        checkout scm
    }

    stage("Расшифровка ключа"){
        withCredentials([string(credentialsId: 'dockerhub', variable: 'password')]) {
                writeFile file: 'token.txt', text: "$password"
                sh "ansible-vault decrypt --vault-password-file token.txt ${curDate}"
                sh "cat ${curDate}"
                sh "rm token.txt"
        }
    }

    /*stage("Ищем ip в файле"){
        def read = readYaml file: curDate
        
        def mb = (curDate =~ "\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}")
            ip = mb[0]
            println "${ip}"
        sh 'curl http://${ip}:8000'
    }*/

    stage("добавляем в yml строк"){
        def read = readYaml file: curDate
        //read.applications[0].components.models.controller["database"] = ["- name": dbname]
        read = ['something': 'my datas',
                        'size': 3,
                        'isEmpty': false]

        writeYaml file: curDate, data: read
        println "${read}"
    }

    /*stage("добавляем в yml 2"){
        def read = readYaml file: curDate
        def yaml = new groovy.yaml.YamlBuilder()
        yaml { temperature 37 }

        def out = new StringWriter()
        read << yaml
        
        writeYaml file: curDate, data: read
        println "${read}"
    }*/
}

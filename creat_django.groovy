#!/usr/bin/env groovy
import org.yaml.snakeyaml.Yaml
import groovy.*
//env.registry="boomer9955/mydjango"
//env.registryCredential="dockerhub_id"
//env.dockerImage=""

node{
    curDate = 'ansible/log.yml'
    stage("1"){
        deleteDir()
        checkout scm
    }
    stage("2"){
        read = readYaml file: curDate
        /*def mb = (curDate =~ "\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}")
            ip = mb[0]
            println "${ip}"
        sh 'curl http://${ip}:8000'*/
        read.user = 'boomer'
        sh "rm $curDate"
       writeYaml file: curDate, data: read
       sh "cat $curDate"
       archiveArtifacts "$curDate"
    }
    stage("3"){
        read = readYaml file: curDate
        read.pass[1] = ['something': 'my datas',
                        'size': 3]

       sh "rm $curDate"
       writeYaml file: curDate, data: read
       sh "cat $curDate"
       archiveArtifacts "$curDate"
    }
    
}

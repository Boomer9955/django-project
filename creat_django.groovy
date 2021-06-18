#!/usr/bin/env groovy
import org.yaml.snakeyaml.Yaml
import groovy.*
//env.registry="boomer9955/mydjango"
//env.registryCredential="dockerhub_id"
//env.dockerImage=""

node{
    checkout scm

    curDate = 'ansible/log.yml'
    read = readYaml file: curDate
    /*def mb = (curDate =~ "\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}")
        ip = mb[0]
        println "${ip}"
    sh 'curl http://${ip}:8000'*/
    read.user = 'boomer'
    read = ['something': 'my datas',
                    'size': 3,
                    'isEmpty': false]

   writeYaml file: curDate, data: read
   sh "cat $curDate"
   archiveArtifacts "$curDate"
    
}

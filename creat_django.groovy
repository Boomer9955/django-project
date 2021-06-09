#!/usr/bin/env groovy
@Grab('org.yaml:snakeyaml:1.17')
import org.yaml.snakeyaml.Yaml
import groovy.*
//env.registry="boomer9955/mydjango"
//env.registryCredential="dockerhub_id"
//env.dockerImage=""

node{
    stage('копируем репу'){
        checkout scm
    }
    stage('собираем image'){
        curDate = readFile 'ansible/log.yml'
        println "${curDate}"
        def ipad = (curDate =~ "\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}")
                ip = ipad[0]
            println "${ip}"
        Yaml parser = new Yaml()
        List example = parser.load(curDate as File).text)
        example.each{println it.user}
            //sh "ansible-vault decrypt --vault-password-file {$password} ansible/password.conf"
            //dockerImage = docker.build registry + ":latest"
    }
}

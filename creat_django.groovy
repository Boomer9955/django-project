#!/usr/bin/env groovy

import groovy.yaml.YamlSlurper

env.registry = "boomer9955/mydjango"
env.registryCredential = "dockerhub_id"
env.dockerImage=""

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
        def config = new YamlSlurper().parseText(curDate)
            println "${config.user}"
            //sh "ansible-vault decrypt --vault-password-file {$password} ansible/password.conf"
            //dockerImage = docker.build registry + ":latest"
    }
}

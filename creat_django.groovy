#!/usr/bin/env groovy
groovy.grape.Grape.grab(group:'org.springframework', module:'spring', version:'2.5.6')
//@Grab(group='yaml', module='YamlSlurper', version='1.0.1')
//import groovy.yaml.YamlSlurper

env.registry = "boomer9955/mydjango"
env.registryCredential = "dockerhub_id"
env.dockerImage=""

node{
    stage('копируем репу'){
        checkout scm
        sh : 'groovy -v'
    }
    stage('собираем image'){
        curDate = readFile 'ansible/log.yml'
        println "${curDate}"
        def ipad = (curDate =~ "\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}")
                ip = ipad[0]
            println "${ip}"
        //def config = new YamlSlurper().parseText(curDate)
        //    println "${config.user}"
            //sh "ansible-vault decrypt --vault-password-file {$password} ansible/password.conf"
            //dockerImage = docker.build registry + ":latest"
    }
}

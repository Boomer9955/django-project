#!/usr/bin/env groovy
//groovy.grape.Grape.grab(group:'org.springframework', module:'spring', version:'2.5.6')
//@Grab(group='yaml', module='YamlSlurper', version='1.0.1')
//import groovy.yaml.YamlSlurper
@Grab(group='org.codehaus.groovy.modules.http-builder', module='http-builder', version='0.7' )
@Grab('org.apache.httpcomponents:httpclient:4.2.6')
env.registry = "boomer9955/mydjango"
env.registryCredential = "dockerhub_id"
env.dockerImage=""

node{
    stage('копируем репу'){
        checkout scm
    }
    stage('sh'){
        sh "groovy -v"
        sh "pwd"
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

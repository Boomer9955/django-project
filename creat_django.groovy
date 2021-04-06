node {
    checkout scm

    Yaml configFileYml = new Yaml("ansible/hosts.yml")
    configFileYml.load(configFile).each { host -> ... }
}

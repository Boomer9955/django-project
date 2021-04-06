node {
    checkout scm
    @Grab('org.yaml:snakeyaml:1.17')

    import org.yaml.snakeyaml.Yaml

    Yaml parser = new Yaml()
    List example = parser.load(("ansible/hosts.yaml" as File).text)

    example.each{println it.subject}
}

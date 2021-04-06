node {
    checkout scm
    import org.yaml.snakeyaml.Yaml

    Yaml parser = new Yaml()
    List example = parser.load(("ansible/hosts.yaml" as File).text)

    example.each{println it.subject}
}

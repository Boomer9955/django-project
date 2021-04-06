import org.yaml.snakeyaml.Yaml
node {
    checkout scm

    Yaml parser = new Yaml()
    List example = parser.load(("ansible/hosts.yaml" as File).text)

    example.each{println it.subject}
}

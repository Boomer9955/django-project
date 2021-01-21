node {

    checkout scm

    docker.withRegistry('https://registry.hub.docker.com', 'dockerHub') {

        def customImage = docker.build("boomer9955/mydjango")

        /* Push the container to the custom Registry */
        customImage.push()
    }
}

dockerCompose {
    useComposeFiles.add("src/test/resources/docker-compose.yaml")
    isRequiredBy(tasks.test)
}
# PLAS tesk-api

**PLAS tesk-api** is part of the [PLAS-TESK](https://github.com/PlatformedTasks/PLAS-TESK) and is an extension of the original [tesk-api](https://github.com/elixir-cloud-aai/tesk-api).
It is an element of the [PLAS project](https://github.com/PlatformedTasks/Documentation) funded by the [GÉANT Innovation Programme](https://community.geant.org/community-programme-portfolio/innovation-programme/) initiative to extend the [GÉANT Cloud Flow (GCF)](https://clouds.geant.org/community-cloud/) to be capable of performing platformed-tasks in the cloud.

This repository includes the code of the image of the *plas-tesk-api* that is run as a container into the Kubernetes cluster by the [PLAS-TESK](https://github.com/PlatformedTasks/PLAS-TESK) Helm chart.

It can be pulled from Docker Hub using the standard Docker syntax:

```console
docker pull platformedtasks/plas-tesk-api:latest
```

Or, if you want to build your own version, you can execute:

```console
mvn clean package -f pom.xml -DskipTests
docker build -t IMAGE_NAME -f Dockerfile
```

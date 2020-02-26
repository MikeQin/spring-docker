# Spring Docker Jib Demo

Using Jib to build Spring-Boot Docker Image, and check it into Docker Hub.

### Setup in `build.gradle`

[build.gradle](build.gradle)

```groovy
id 'com.google.cloud.tools.jib' version '2.0.0'

...

jib {
    to {
        image = 'michaeldqin/spring-docker'
        tags = ['1.0.0','latest']
        auth {
            username = dockerhub_user // Defined in 'gradle.properties'.
            password = dockerhub_password // Defined in 'gradle.properties'.
        }
    }
}

```

### Usage

```jshelllanguage
gradle jib
```

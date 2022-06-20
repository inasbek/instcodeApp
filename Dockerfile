FROM openjdk:8u111-jdk-alpine

VOLUME /tmp

ADD /target/*.jar instacode-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/instacode-0.0.1-SNAPSHOT.jar"]

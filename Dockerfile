FROM openjdk:8-jre-slim

# RUN apt-get update && apt-get install -y wait-for-it netcat

ARG JAR='./build/libs/devops-0.0.1-SNAPSHOT.jar'

RUN groupadd application && useradd application -g application -d /application -m

COPY ${JAR} /application/app.jar

WORKDIR /application

USER application

EXPOSE 8080

CMD ["java", "-jar", "app.jar"]

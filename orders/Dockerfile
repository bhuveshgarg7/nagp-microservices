FROM openjdk:8-jdk-alpine

VOLUME /tmp

COPY target/*.jar orders-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","/orders-0.0.1-SNAPSHOT.jar"]

EXPOSE 8001
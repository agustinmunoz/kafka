FROM openjdk:17-alpine
VOLUME /tmp
EXPOSE 8282
ADD ./target/kafka-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
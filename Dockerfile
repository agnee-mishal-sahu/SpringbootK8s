FROM openjdk:17-jdk-slim
ARG JAR_FILE=target/46330799SimplePrj-1-0.0.1-SNAPSHOT.jar
WORKDIR .
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","app.jar"]
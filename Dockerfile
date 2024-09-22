FROM openjdk:17-jdk-slim
ADD target/employee-management-docker.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]
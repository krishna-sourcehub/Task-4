# Build stage
FROM maven:3.8.2-jdk-17 AS build
WORKDIR /app
COPY ./app/
RUN mvn clean package 

# Package stage
FROM openjdk:17-jdk-slim
WORKDIR /app
COPY --from=build /app/target/userRegistration-2em-3.0.2.jar /app/app.jar
EXPOSE 8881
ENTRYPOINT ["java","-jar","app.jar"]

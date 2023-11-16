
# Build stage
FROM maven:3.8.4-openjdk-17 AS build
WORKDIR /app
COPY . .
RUN mvn clean package

# Package stage
FROM openjdk:17-jdk-slim
WORKDIR /app
COPY --from=build /app/target/userRegistration-2em-3.0.2.jar demo.jar
EXPOSE 8881
ENTRYPOINT ["java","-jar","demo.jar"]

FROM ubuntu-latest AS build
RUN apt-get update
RUN apt-get install openjdk-17-jdk -y

# Package stage
FROM openjdk:17-jdk-slim
COPY --from=build /app/target/userRegistration-2em-3.0.2.jar demo.jar
EXPOSE 8881
ENTRYPOINT ["java","-jar","demo.jar"]

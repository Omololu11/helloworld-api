# Use the official OpenJDK 17 runtime as the base image
FROM openjdk:17-jdk-slim

# Copy the JAR file from the target directory to the container
COPY target/*.jar /app.jar

# Specify the entry point for the container
ENTRYPOINT ["java", "-jar","/app.jar"]
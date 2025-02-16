# Use an openjdk base image
FROM openjdk:17-jdk-slim

# Set the working directory in the container
WORKDIR /app

# Copy the JAR file from the local machine to the container
COPY java-8-example/target/java-8-example-0.0.1-SNAPSHOT.jar /app/java-8-example-0.0.1-SNAPSHOT.jar

# Expose the port the app will run on
#EXPOSE 8081

# Run the JAR file
ENTRYPOINT ["java", "-jar", "java-8-example-0.0.1-SNAPSHOT.jar"]


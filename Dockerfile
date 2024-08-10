# Use an official OpenJDK 21 runtime as a parent image
FROM eclipse-temurin:21-jdk

# Set the working directory inside the container
WORKDIR /app

# Copy the application's jar file to the container
COPY target/movies-0.0.1-SNAPSHOT.jar app.jar

# Expose port 8080 (or whatever port your application uses)
EXPOSE 8080

# Set the entry point to run the jar file
ENTRYPOINT ["java", "-jar", "app.jar"]

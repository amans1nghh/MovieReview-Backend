# Use an official OpenJDK runtime as a parent image
FROM openjdk:21-jdk

# Set the working directory inside the container
WORKDIR /app

# Copy the executable jar file into the container at /app
COPY target/movies-0.0.1-SNAPSHOT.jar /app/app.jar

# Expose the port your Spring Boot app runs on (default is 8080)
EXPOSE 8080

# Run the jar file
ENTRYPOINT ["java","-jar","/app/app.jar"]

# Base image with Maven
FROM maven:3.8-openjdk AS build

WORKDIR /build

COPY . .

# Run the Spring Boot application with Maven
CMD mvn spring-boot:run

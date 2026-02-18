# Veterinary Clinic REST API
A RESTful API built with Spring Boot.

## Features
- Owner, Pet, Appointment management 
- Layered architecture (Controller, Service, Repository)
- JPA relationships
- Validation and global exception handling
- Actuator health endpoint

## Tech Stack
- Java 17
- Spring Boot 4.0.2
- Spring Data JPA
- H2 Database
- Lombok
- Maven

## How to Run
1. Clone repository: https://github.com/NicoleRW/veterinary-clinic-rest-api
2. Open in IntelliJ or run via terminal: ./mvnw spring-boot:run
3. Access Actuator endpoint: `http://localhost:8080/actuator/health`
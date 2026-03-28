# Cloud Vendor Management REST API

A RESTful API built with Java and Spring Boot for managing cloud vendor
service information. Supports full CRUD operations with structured
exception handling and a clean layered architecture.

## Tech Stack
- Java 17
- Spring Boot
- MySQL (MySQL Workbench)
- Maven

## Architecture
The project follows a layered architecture pattern:
- **Controller Layer** – Handles HTTP requests and responses
- **Service Layer** – Business logic via interface + implementation
- **Repository Layer** – Database access using Spring Data JPA
- **Exception Layer** – Custom exceptions with global exception handler
- **Response Handler** – Standardized API response structure

## API Endpoints

| Method | Endpoint               | Description              |
|--------|------------------------|--------------------------|
| GET    | /cloudvendor           | Get all cloud vendors    |
| GET    | /cloudvendor/{id}      | Get vendor by ID         |
| POST   | /cloudvendor           | Add new cloud vendor     |
| PUT    | /cloudvendor/{id}      | Update vendor details    |
| DELETE | /cloudvendor/{id}      | Delete a cloud vendor    |

## Project Structure
```
src/
├── controller/
│   └── CloudVendorController.java
├── service/
│   ├── CloudVendorService.java          # Interface
│   └── impl/
│       └── CloudVendorServiceImpl.java  # Implementation
├── model/
│   └── CloudVendor.java
├── exception/
│   ├── CloudVendorException.java
│   ├── CloudVendorNotFoundException.java
│   └── CloudVendorExceptionHandler.java
└── Response/
    └── ResponseHandler.java
```

## How to Run Locally

1. Clone the repository
   git clone https://github.com/Kainat90/restdemo.git

2. Create a MySQL database
   CREATE DATABASE restdemo;

3. Update application.properties
   spring.datasource.url=jdbc:mysql://localhost:3306/restdemo
   spring.datasource.username= root
   spring.datasource.password= winter

4. Run the application
   ./mvnw spring-boot:run

5. API is available at http://localhost:8080

## What I Learned
- Designing RESTful APIs with Spring Boot
- Layered architecture (Controller → Service → Repository)
- Custom exception handling with @ControllerAdvice
- Database integration with Spring Data JPA and MySQL
- Clean code practices with interface-based service design
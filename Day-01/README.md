# Day 01 – Spring Boot Fundamentals and Employee Multithreading

## Objective

To understand the fundamentals of Spring Boot and develop a basic Employee Multithreading application using Java and Spring Boot.

## Concepts Covered

- Introduction to Spring Framework and Spring Boot.
- Spring Boot project creation using Spring Initializr.
- Understanding Dependency Injection (DI) and Inversion of Control (IoC).
- Understanding Spring Boot annotations such as `@SpringBootApplication`, `@RestController`, and `@Service`.
- Introduction to REST APIs and HTTP POST requests.
- Understanding asynchronous execution using `@Async`.
- Introduction to `CompletableFuture` and Java Multithreading.

## Implementation

- Created a Spring Boot project using Maven and Java 21.
- Added the Spring Web dependency.
- Implemented an Employee model with ID, name, and department.
- Created an Employee Service to process employee details asynchronously.
- Developed a REST Controller to receive employee details through a POST request.
- Enabled asynchronous processing using `@EnableAsync`.
- Tested the application using PowerShell and verified multiple concurrent employee requests.

## Output

- Successfully started the Spring Boot application on port 8080.
- Successfully tested the Employee REST API.
- Verified employee details were processed and returned.
- Tested multiple employee requests concurrently.

## Technologies Used

- Java 21
- Spring Boot 4.2.0
- Spring Web
- Maven
- IntelliJ IDEA
- PowerShell
- Git and GitHub

## Learning Outcome

Gained practical knowledge of Spring Boot project creation, REST API development, dependency injection, and asynchronous processing. Understood how `@Async` and `CompletableFuture` help execute tasks concurrently in a Spring Boot application.

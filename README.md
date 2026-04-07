# Task Core Application

This project is a Spring Boot application designed to manage tasks. It serves as a core service for task-related operations, featuring a simple domain model and service layer for task management.

## Technologies Used

*   **Spring Boot**: Version 4.0.3 (Note: This is a future-dated version, likely used for educational/experimental purposes).
*   **Java**: Version 17.
*   **Spring Data JPA**: For data persistence and repository management.
*   **MySQL**: Database for storing task information.
*   **Lombok**: To reduce boilerplate code (e.g., getters, setters, constructors).
*   **Maven**: Build automation tool.
*   **Nexus**: Used for managing snapshot and release artifacts.

## Project Structure

*   `src/main/java/sn/isi/l3gl/core/entity/Task.java`: Defines the `Task` entity with fields like `id`, `title`, `description`, and `status`.
*   `src/main/java/sn/isi/l3gl/core/enums/TaskStatus.java`: An enum defining possible task statuses (`TODO`, `IN_PROGRESS`, `DONE`).
*   `src/main/java/sn/isi/l3gl/core/repository/TaskRepository.java`: JPA repository for `Task` entities, extending `JpaRepository`.
*   `src/main/java/sn/isi/l3gl/core/service/TaskService.java`: Provides business logic for task operations (create, list, update status, count completed tasks).
*   `src/main/resources/application.properties`: Configuration for the Spring Boot application, including MySQL database connection details.
*   `src/main/java/sn/isi/l3gl/core/task_core/TaskCoreApplication.java`: The main entry point of the Spring Boot application.
*   `pom.xml`: Maven Project Object Model file, defining dependencies, build process, and distribution management to Nexus.

## Development Status

The project is under development, with incremental versions of the `TaskService` indicating feature additions.

## Current Known Issues & Future Improvements

*   **Component Scanning Issue**: The `TaskCoreApplication` is not in the root package, which might lead to Spring not detecting components in sibling packages.
*   **Database Dependency in Tests**: Tests currently require a running MySQL instance, causing failures if the database is unavailable. It's recommended to configure an in-memory database like H2 for testing.
*   **Limited Test Coverage**: Only a basic `contextLoads` test exists. More comprehensive unit and integration tests are needed.
*   **Maven Plugin Configuration**: The `spring-boot-maven-plugin` is configured to skip execution, suggesting this might be a library rather than a deployable application.

## Getting Started

To run this application, ensure you have Java 17 and Maven installed. A MySQL database named `taskdb` is expected to be running locally on port 3306, with username `root` and an empty password (as configured in `application.properties`).

## Build and Run

To build the project:
```bash
mvn clean install
```

To run the application (after fixing the component scanning issue and ensuring MySQL is running):
```bash
mvn spring-boot:run
```


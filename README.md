# Keycloak Integration with Spring Boot 3

This project illustrates the implementation of Keycloak integration for securing a Spring Boot application. Keycloak is a robust open-source Identity and Access Management tool with features such as Single Sign-On (SSO) using OpenID Connect, Role-Based Access Control (RBAC), and Fine-Grained Authorization.

## Features

- Single Sign-On (SSO) with OpenID Connect
- Role-Based Access Control (RBAC)
- Fine-Grained Authorization

## Prerequisites

Ensure the following software is installed before proceeding:

- Java 17+
- Maven
- Keycloak Server 21+

## Getting Started

Follow these instructions to set up the project on your local machine for development and testing purposes.

### Installation

1. Clone the repository:

    ```bash
    git clone https://github.com/seremwen/Spring-Boot-Keycloack-Integration.git
    ```

2. Navigate into the project directory:

    ```bash
    cd Spring-Boot-Keycloack-Integration
    ```

3. Build the project using Maven:

    ```bash
    mvn clean install
    ```

4. Run the Spring Boot application:

    ```bash
    mvn spring-boot:run
    ```

### Keycloak Setup

1. Run the docker-compose file:

    ```bash
    docker-compose up -d
    ```

2. Navigate to Keycloak Admin UI Console.

3. Create a new Realm and name it "Nseremwe," or update the `application.yml` file and specify your Realm name.

4. Create Roles.

5. Create Users.

6. Assign roles to users.

## API Endpoints

### Payments API

```java
@RestController
@RequestMapping("/api/v1/payments")
public class PaymentsApi {

    @GetMapping("/all")
    @PreAuthorize("hasRole('ACCOUNTS')")
    public List<Payment> getAllPayments() {
        // Implementation goes here
    }
}
```

### Courses API

```java
@RestController
@RequestMapping("/api/v1/courses")
public class CoursesApi {

    @GetMapping("/all")
    @PreAuthorize("hasRole('ACADEMICS')")
    public List<Course> getAllCourses() {
        // Implementation goes here
    }
}
```

### Students API

```java
@RestController
@RequestMapping("/api/v1/students")
public class StudentsApi {

    @GetMapping("/all")
    @PreAuthorize("hasRole('ADMISSIONS')")
    public List<Student> getAll() {
        // Implementation goes here
    }
}
```

## Usage

*To be determined*

## Contributing

Feel free to submit pull requests. For significant changes, kindly open an issue first to discuss proposed modifications.

Ensure to update tests as needed.

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details.

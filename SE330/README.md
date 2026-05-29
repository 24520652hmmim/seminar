# SE330 Student Registration App

A simple Spring Boot web application that demonstrates student registration using Thymeleaf views.

## Features

- Spring Boot MVC application with server-side rendered pages
- Registration form for student details
- Result page showing registration confirmation
- Optional student list page for displaying registered students
- Clean separation of controller, service, model, and view layers

## Tech Stack

- Java 17
- Spring Boot 4.0.6
- Thymeleaf templates
- Maven wrapper (`mvnw` / `mvnw.cmd`)

## Project Structure

- `src/main/java/com/example/SE330`
  - `Se330Application.java` — application entry point
  - `controller/StudentController.java` — request handling and page navigation
  - `service/StudentService.java` — business logic for student registration
  - `model/Student.java` — student data model
- `src/main/resources/templates`
  - `register.html` — registration form
  - `result.html` — registration confirmation page
  - `students.html` — registered students listing page
- `pom.xml` — Maven build configuration

## Getting Started

### Prerequisites

- Java 17 or later
- Maven is optional because the Maven wrapper is included

### Run Locally

From the project root directory:

```bash
# On macOS / Linux
./mvnw spring-boot:run

# On Windows
mvnw.cmd spring-boot:run
```

Then open the application in your browser:

```text
http://localhost:8080/register
```

### Build Jar

```bash
# On macOS / Linux
./mvnw clean package

# On Windows
mvnw.cmd clean package
```

Run the generated JAR:

```bash
java -jar target/SE330-0.0.1-SNAPSHOT.jar
```

## Notes

- The application uses Thymeleaf for rendering HTML templates.
- The default page redirects to the registration form at `/register`.
- If the `students.html` page is enabled in the controller, it can display a list of registered students.

## References

- [Spring Boot](https://spring.io/projects/spring-boot)
- [Thymeleaf](https://www.thymeleaf.org/)
- [Maven](https://maven.apache.org/)

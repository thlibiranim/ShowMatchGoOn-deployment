# ShowMatchGoOn Backend Skeleton Documentation

The **ShowMatchGoOn Backend** is a robust **Spring Boot** application designed to serve as the foundation for a comprehensive entertainment ecosystem. This skeleton implementation provides the core architectural components necessary to support user management, content libraries, cinema integrations, and social features, ensuring a scalable and maintainable backend service.

## Implemented Modules and Features

The current implementation establishes a layered architecture that separates concerns across the data, business logic, and presentation layers.

| Module | Features | Description |
| :--- | :--- | :--- |
| **Project Foundation** | Maven, Spring Boot 3.3.0 | Standardized build and runtime environment with automated dependency management. |
| **User & Subscription** | JPA Entities, Repositories | Core models for user profiles and multi-tier subscription plans. |
| **Content Library** | REST Controllers, Services | Endpoints for managing and retrieving diverse entertainment content (movies, series). |
| **Cinema Integration** | Relational Data Models | Structured entities for theater locations, showtimes, and booking logic. |
| **Security & Database** | Spring Security, H2 | Pre-configured security filters and an in-memory database for rapid development. |

## Technical Specifications

The backend leverages a modern technology stack to ensure performance and developer productivity:

- **Framework**: Spring Boot 3.3.0 with Web, Security, and Data JPA starters.
- **Persistence**: Spring Data JPA with an H2 in-memory database for zero-configuration startup.
- **Utility**: Project Lombok is utilized to reduce boilerplate code in entity and DTO definitions.
- **Security**: Configured with a flexible security filter chain to facilitate API development and testing.

## Getting Started

To initialize the development environment, ensure that **Java 17** and **Maven** are installed on your system.

1. **Project Navigation**: Change your directory to the backend root: `cd ShowMatchGoOn_Backend`.
2. **Build Process**: Execute a clean installation to resolve dependencies: `mvn clean install`.
3. **Application Startup**: Launch the Spring Boot application: `mvn spring-boot:run`.

## Primary API Endpoints

The following RESTful endpoints are available for initial integration with the frontend:

- **`GET /api/content`**: Retrieves a comprehensive list of all available entertainment content.
- **`GET /api/content/type/{type}`**: Filters content based on its classification, such as `MOVIE` or `SERIES`.
- **`POST /api/content`**: Allows for the programmatic addition of new content items to the library.

This skeleton serves as a starting point for further development, including the implementation of the AI-driven recommendation engine and real-time social features.

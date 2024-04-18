# Alphaware_Blog_Application
## Blog Application

This is a simple blog application implemented using Spring Boot. It includes features like user registration, login, post creation, commenting, category management, and more.

## Technologies Used

- Java
- Spring Boot
- Spring Security
- JWT Authentication
- Swagger

## Features

- **User Management**: Allows users to register and login using JWT authentication.
- **Post Management**: Users can create, view, update, and delete their posts.
- **Commenting**: Users can comment on posts.
- **Category Management**: Admins can manage categories for posts.

## Setup

1. **Clone the repository**:

    ```bash
    git clone <https://github.com/Virendrakumardwivedi/Alphaware_Blog_Application>
    ```

2. **Build and Run**:

    ```bash
    cd blog-application
    mvn spring-boot:run
    ```

3. **Access Swagger UI**:

    Swagger UI provides an interactive documentation for the API endpoints. Access it at ([http://localhost:8080/swagger-ui.html](http://localhost:8888/swagger-ui/index.html#/)).

## API Endpoints

- **User API**:
    - `/api/user/register`: Register a new user.
    - `/api/user/login`: Authenticate and generate JWT token.
    - `/api/user/welcome`: Welcome message.
    - `/api/user/getUsers`: Get all users.
    - `/api/user/getUsers/{id}`: Get user by ID.

- **Post API**:
    - `/api/posts`: Create a new post.
    - `/api/posts/{id}`: Get post by ID.
    - `/api/posts`: Get all posts.
    - `/api/posts/{id}`: Update post by ID.
    - `/api/posts/{id}`: Delete post by ID.

- **Comment API**:
    - `/api/comments`: Add a new comment.
    - `/api/comments/{id}`: Get comment by ID.
    - `/api/comments`: Get all comments.
    - `/api/comments/{id}`: Update comment by ID.
    - `/api/comments/{id}`: Delete comment by ID.

- **Category API**:
    - `/api/category`: Create a new category.
    - `/api/category/{id}`: Get category by ID.
    - `/api/category`: Get all categories.
    - `/api/category/{id}`: Delete category by ID.

## Security

- JWT authentication is used for securing the API endpoints.
- Each request must include a valid JWT token in the Authorization header.

## Contribution

Contributions are welcome! Feel free to fork the repository and submit pull requests.

## Swagger output


![Screenshot (588)](https://github.com/Virendrakumardwivedi/Alphaware_Blog_Application/assets/101566111/ccfb43b2-382a-4fc0-80ad-cb4dcc30a23e)



![Screenshot (589)](https://github.com/Virendrakumardwivedi/Alphaware_Blog_Application/assets/101566111/62534e0e-689d-404b-bd1a-0a153dfb688f)


![Screenshot (590)](https://github.com/Virendrakumardwivedi/Alphaware_Blog_Application/assets/101566111/c16342da-6135-425a-8962-5bb182e5e915)



![Screenshot (591)](https://github.com/Virendrakumardwivedi/Alphaware_Blog_Application/assets/101566111/228f8893-e6b8-462f-bdaa-052d6db6b2bb)


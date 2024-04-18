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


![Screenshot (584)](https://github.com/Virendrakumardwivedi/Alphaware_Blog_Application/assets/101566111/b04d4d07-5436-4acb-ab7f-e7085e4be1cf)



![Screenshot (585)](https://github.com/Virendrakumardwivedi/Alphaware_Blog_Application/assets/101566111/c5a5315d-8a84-4a7a-8c58-ef50acaa5a14)



![Screenshot (586)](https://github.com/Virendrakumardwivedi/Alphaware_Blog_Application/assets/101566111/23a1c213-cace-4f17-be69-c4f4a3cf8f41)


![Screenshot (587)](https://github.com/Virendrakumardwivedi/Alphaware_Blog_Application/assets/101566111/fd792bec-0c5e-4854-9e50-9570d3aaf50c)

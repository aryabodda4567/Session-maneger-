 

# Session Manager

## Overview
This project is a simple **Session Manager** built using **Spring Boot**. It handles the creation, retrieval, and deletion of user sessions. Sessions are stored in a **Concurrent HashMap** for efficient, thread-safe storage and retrieval of session data.

## Features
- Create new user sessions.
- Retrieve existing user sessions using the session ID.
- Delete user sessions by session ID.

## Technologies Used
- **Java 11+**
- **Spring Boot** (REST API development)
- **Concurrent HashMap** (to store user sessions in a thread-safe manner)
- **Maven** (build tool)

## User Model
The **User** model stores the following information:
- **User ID**: A unique identifier for each user.
- **Role**: The role of the user (e.g., admin, user).
- **Session ID**: The unique identifier for the user's session.

## API Endpoints

### 1. Create Session
- **URL**: `/session`
- **Method**: `POST`
- **Request Body**:
    ```json
    {
        "userId": "string",
        "role": "string",
        "sessionId": "string"
    }
    ```
- **Response**: 
    - `200 OK`: If the session is successfully created.
    - `400 Bad Request`: If required fields are missing.
    - `500 Internal Server Error`: In case of any errors during session creation.

### 2. Get Session
- **URL**: `/session/{session_id}`
- **Method**: `GET`
- **Response**:
    - `200 OK`: Returns the session details.
    - `400 Bad Request`: If the session ID is empty.
    - `404 Not Found`: If the session does not exist.
    - `500 Internal Server Error`: In case of any errors during retrieval.

### 3. Delete Session
- **URL**: `/session/{session_id}`
- **Method**: `DELETE`
- **Response**:
    - `200 OK`: If the session is successfully deleted.
    - `400 Bad Request`: If the session ID is empty.
    - `404 Not Found`: If the session does not exist.
    - `500 Internal Server Error`: In case of any errors during deletion.

## Installation & Setup

### Prerequisites
- Java 11 or higher
- Maven

### Steps to Run
1. Clone the repository:
    ```bash
    git clone https://github.com/aryabodda4567/session-manager.git
    ```
2. Navigate to the project directory:
    ```bash
    cd session-manager
    ```
3. Build the project using Maven:
    ```bash
    mvn clean install
    ```
4. Run the application:
    ```bash
    mvn spring-boot:run
    ```

The application will be running on `http://localhost:8080`.

## How It Works
- Sessions are stored using a **Concurrent HashMap** to ensure thread-safe operations and high performance in a multi-threaded environment.
- Each session is uniquely identified by a **Session ID** and linked to a **User ID** and **Role**.
  

---

 

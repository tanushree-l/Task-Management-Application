<h1>Task Management Application – Spring Boot REST API</h1>  
A simple Task Management REST API built using Spring Boot.  
This project allows users to create, update, view, and delete tasks using RESTful endpoints.  
  
It demonstrates backend development concepts such as REST APIs, CRUD operations, Spring Boot architecture, and database integration.  
  
## Features
- Create a new task  
- View all tasks (Get All Tasks) 
- View task by id (Get Task By ID)  
- Update an existing task   
- Delete a task  
  
## Tech Stack  
### Backend 
- Java  
- Spring Boot  
- Spring Data JPA  
- Maven  
  
### Database:  
- MySQL  
  
### Tools: 
- Postman (API Testing)  
- Git & GitHub
  
## API Endpoints
- Create Task - POST /tasks
- Get All Tasks - GET /tasks/view
- Get Task By ID - GET /tasks/{id}
- Update Task - PUT /tasks/update/{id}
- Delete Task - DELETE /tasks/delete/{id}

## Future Improvements
- Add user authentication (JWT)
- Add task priority
- Add due date
- Build frontend using React
- Deploy to cloud (Render / AWS)

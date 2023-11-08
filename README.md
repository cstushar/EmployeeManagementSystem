# Employee Management System - Coding Assignment

This repository contains the source code and documentation for the Employee Management System coding assignment as part of the assessment by AulaCube Technologies Pvt Ltd.

## Objective

The objective of this assignment is to create a simple Employee Management System using Spring Boot, demonstrating the integration of both PostgreSQL and MongoDB databases. The application is designed to perform basic CRUD (Create, Read, Update, Delete) operations on employee and department data.

## Requirements
### Entities

#### Employee (Stored in PostgreSQL):
- `id`: Long (Primary Key)
- `firstName`: String
- `lastName`: String
- `email`: String
- `departmentId`: String (Foreign Key)
- `createdAt`: Timestamp
- `updatedAt`: Timestamp

#### Department (Stored in MongoDB):
- `departmentId`: String (Primary Key)
- `departmentName`: String
- `createdAt`: Timestamp
- `updatedAt`: Timestamp

### Functionalities

- Implement the employee CRUD operations
- Implement the department CRUD operations

## Additional Considerations

- Implement proper exception handling
- Bonus points for deploying this application on a cloud service
- Proper utilization of Spring Boot features and conventions
- RESTful API design and proper HTTP status code usage

## Getting Started

To get started with this assignment, follow these steps:

1. Clone this repository to your local machine:

   ```bash
   git clone https://github.com/cstushar/EmployeeManagementSystem.git
   ```

2. Follow the installation instructions in the project's README to set up and run the application locally.

## Contributors

- [Tushar Gupta](https://github.com/cstushar)

## License

This project is licensed under the public. Feel free to use, modify, and distribute it as per the terms of the license.

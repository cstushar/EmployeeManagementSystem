# EmployeeManagementSystem

Question 2: Coding assignment

Objective:
The aim of this assignment is to create a simple Employee Management System
using Spring Boot, demonstrating the integration of both PostgreSQL and
MongoDB databases. The application should be able to perform basic CRUD
(Create, Read, Update, Delete) operations on employee, department data.

Requirements :

Entities:
Employee (Stored in PostgreSQL):
● id: Long (Primary Key)
● firstName: String
● lastName: String
● email: String
● departmentId: String (Foreign Key)
● createdAt: Timestamp
● updatedAt: Timestamp
Department (Stored in MongoDB)
● departmentId: String (Primary Key)
● departmentName: String
● createdAt: Timestamp
● updatedAt: Timestamp

Functionalities :
● Implement the employee crud operations
● Implement the department crud operations

Things to keep in mind
● Implement proper exception handling
● More extra points for deploying this application on some cloud service..
● Proper utilisation of Spring Boot features and conventions.
● RESTful API design and proper HTTP status code usage.

AulaCube Technologies Pvt Ltd
#  Employee Management System (Java + MySQL)

A simple console-based CRUD (Create, Read, Update, Delete) application to manage employee records. Built using Java and MySQL, this project demonstrates core concepts of JDBC, database integration, and basic user interaction via terminal.

---

##  Features

-  Add New Employees
-  Update Existing Employee Details
-  Delete Employees
-  View Employee Information by ID
-  MySQL Database Integration
-  Console-Based UI (Text Menu)
-  Input Validations & Exception Handling

---

##  Tech Stack

| Tech             | Description                        |
|------------------|------------------------------------|
| Java             | Backend Logic (JDK 8 or above)     |
| MySQL            | Relational Database                |
| JDBC             | Java Database Connectivity         |
| Eclipse/IntelliJ | Recommended IDEs                   |
| Git & GitHub     | Version Control & Collaboration    |

---

##  Database Setup (MySQL)

1. Open MySQL Workbench or CLI
2. Run the following:

```sql
CREATE DATABASE employee_db;

USE employee_db;

CREATE TABLE employees (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100),
    email VARCHAR(100) UNIQUE,
    designation VARCHAR(100),
    salary DECIMAL(10,2)
);

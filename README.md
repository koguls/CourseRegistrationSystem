# Course Registration System  

![Project Screenshot](https://github.com/koguls/OnlyImg/blob/843d7e10b40ea65ab11aec1e08455b0c9918147d/img1.png)  

## Overview  
The **Course Registration System** is a web-based application that allows students to register for courses, view available courses, and check enrolled students. It integrates front-end and back-end technologies to provide a seamless experience.  

## Features  

### 1. Register a Course  
- **Fields**:  
  - Name  
  - Email  
  - Course selection (Dropdown)
 
    
![Project Screenshot](https://github.com/koguls/OnlyImg/blob/843d7e10b40ea65ab11aec1e08455b0c9918147d/img3.png)

### 2. Available Courses  
- Displays the real-time list of courses in a table format.


 ![Project Screenshot](https://github.com/koguls/OnlyImg/blob/843d7e10b40ea65ab11aec1e08455b0c9918147d/img5.png)

### 3. Enrolled Students  
- Shows the real-time list of students registered for each course in a table format.

  
 ![Project Screenshot](https://github.com/koguls/OnlyImg/blob/843d7e10b40ea65ab11aec1e08455b0c9918147d/img6.png)

 ![](https://github.com/koguls/OnlyImg/blob/843d7e10b40ea65ab11aec1e08455b0c9918147d/img7.png)

## Technologies Used  

### **Front-End**  
- **Development Environment:** VS Code  
- HTML  
- CSS  
- JavaScript  
- Run using **Live Server Extension**  

### **Back-End**  
- **Development Environment:** IntelliJ IDEA  
- Java  
- JDBC  
- Hibernate  
- Spring & Spring Boot  
- MySQL  
- Maven (Build Tool)

   ![Project Screenshot](https://github.com/koguls/OnlyImg/blob/843d7e10b40ea65ab11aec1e08455b0c9918147d/backendimg1.png)
   ![Project Screenshot](https://github.com/koguls/OnlyImg/blob/843d7e10b40ea65ab11aec1e08455b0c9918147d/bimg2.png) 

### **API Testing**  
- **Postman** (Used for API testing and validation)

   ![Project Screenshot](https://github.com/koguls/OnlyImg/blob/843d7e10b40ea65ab11aec1e08455b0c9918147d/bimg3.png)

## Project Structure  

```plaintext
Course-Registration-System/
│── Course-Registration-Frontend/  (Developed in VS Code)
│   ├── index.html
│   ├── styles.css
│   ├── script.js
│── Course-Registration-Backend/  (Developed in IntelliJ IDEA)
│   ├── src/main/java/com/example/course/
│   │   ├── controller/
│   │   ├── service/
│   │   ├── repository/
│   │   ├── model/
│   │   ├── CourseRegistrationApplication.java
│   ├── src/main/resources/
│   │   ├── static/
│   │   ├── templates/
│   │   ├── application.properties
│   ├── pom.xml
│── README.md
│── Course-Registration-API.postman_collection.json  (Postman API Collection)



```
## How to Run
Frontend (VS Code)

    Open the Course-Registration-Frontend folder in VS Code.
    Install the Live Server extension.
    Right-click index.html → Click "Open with Live Server".

Backend (IntelliJ IDEA)

    Open the Course-Registration-Backend folder in IntelliJ IDEA.
    Configure the MySQL database in application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/coursedb
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update

Build and run the Spring Boot application:

mvn spring-boot:run

Backend API will run at:

    http://localhost:8080

API Testing (Postman)

    Open Postman.
    Import the Course-Registration-API.postman_collection.json file.
    Use the available API endpoints for testing:

API Endpoint	Method	Description
/api/courses	GET	Get available courses
/api/courses/register	POST	Register a new student for a course
/api/students	GET	Get enrolled students list
Screenshots
Registration Page	Available Courses	Enrolled Students
	


### Updates:
✅ **Postman** is now mentioned for API testing.  
✅ **Postman collection file (`Course-Registration-API.postman_collection.json`)** is included for easy API testing.  
✅ **API Endpoints table** is added for quick reference.  

This README now fully documents your **frontend, backend, and API testing setup**. Let me know if you


Contributing

Contributions are welcome! Feel free to fork the repository and submit pull requests.


## 🙋‍♂️ Author
**Kogul**  
[GitHub Profile](https://github.com/koguls)

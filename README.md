
# Love Calculator SpringMVC Web Application

Welcome to the Love Calculator SpringMVC Web Application! This fun and interactive web app allows users to input their name and their crush's name to calculate their relationship type. Additionally, users can opt to receive the result via email.


## Table of Content

- Technologies Used
- Setup and Installation
- Email Configuration
- Database Configuration
- Features
- Contributing



## Technologies Used
- Spring Core
- Spring MVC
- Java 17
- Dynamic Web Module 6.0
- Tomcat 10.1
- Maven


## Setup and Installation

Clone the Repo

```bash
  git clone https://github.com/DevKhanHassam/LoveCalculator.git
```

- Import the project into your IDE
    -- Ensure you have compatible IDE (e.g., Eclispe, STS, Intellij   IDEA) and import the project as Maven project.
  

- Configure the server
    -- Use Tomcat 10.1 as the server
    -- Ensure your IDE is configured to use Java 17


- Update Project
    -- RightClick on project then click Maven->Update Project.
    -- All necessary dependencies are included in the pom.xml file.   Make sure your IDE resolves these dependencies.




## Email Configuration

  ### Configure email properties
    Open the file:"Email.properties" inside /LoveCalculator/src/main/resources.
    Set your email credentials ("setUsername" as your email address and "setPassword" go to google settings to generate password for application if you face problem read below)
 
  ### Generate App password
    Google has changed its policy, so your email password is not the same as the application password.
    Follow this below given link to generate the application-specific password.
    





## 🔗 Links

[Video to Generate password](https://www.linkedin.com/)



## Database Configuration
 - Create Schema name="lovecalculator".
 - Create table in schema name=lovetable.
 --Query to generate table="CREATE TABLE `lovetable` (`USER_ID` int NOT NULL AUTO_INCREMENT,  `USER_NAME` varchar(45) NOT NULL, `USER_CRUSH` varchar(45) NOT NULL, `USER_AGE` int NOT NULL, `USER_EMAIL` varchar(50) NOT NULL,  `USER_RESULT` varchar(45) NOT NULL,  PRIMARY KEY (`USER_ID`)) ENGINE=InnoDB AUTO_INCREMENT=101 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci'
"

## Features
 - Session management.
 - Users can opt to receive the result via email.


## Contributing 
  - We welcome contributions! Please fork the repository and submit pull requests.



# Demo Cart API

## About

This is a demo project using Spring Boot and Java 17. You need an IDE with Lombok support.

## Configuration

### Configuration Files

Folder **src/resources/** contains config files for **shopping-cart** Spring Boot application.

* **src/resources/application.properties** - main configuration file. Here it is possible to change admin username/password,
  as well as change the port number.


## How to run

### Maven Wrapper

#### Using the Maven Plugin

Go to the root folder of the application and type:
```bash
$ chmod +x ./mvnw
$ ./mvnw spring-boot:run
```

### H2
Console URL : [H2](http://localhost:8081/database/h2)
Note: If you change server port in properties you need change H2 url port.



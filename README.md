# Demo Cart API

## About

This is a demo project using Spring Boot and Java 17 with cache ena. You need an IDE with Lombok support. TTL is enabled as bean in principal class and time has been configurated in properties.

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

### Swagger

Docs URL: [Swagger](http://localhost:8081/swagger-ui.html#/)

Note: If you change server port in properties you need change port in both urls.




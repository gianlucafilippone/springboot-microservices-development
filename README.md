# Spring Boot Openjob system

Sample Spring Boot microservice application, developed with Spring Cloud, Spring Cloud Config, Spring Cloud Netflix Eureka, Spring Cloud OpenFeign, Spring Retry

Openjob is a simple platform allowing people to publish or apply for job offers.

## Requirements
- Java JDK 17 (or later)
- Apache Maven

## Monolithic application

The Openjob monolithic application is found in `/monolithic-application/openjob/` folder. It is built with Spring Boot 3, Spring Data JPA and H2.


### Download, installation and run

Download the repository

```
git clone https://github.com/gianlucafilippone/springboot-microservices-development.git
cd monolithic-application/openjob
```

#### Run on the local machine

Compile and run

```
mvn package
java -jar target/openjob-0.0.1-SNAPSHOT.jar 
```
As alternative

```
mvn spring-boot:run
```

By default, a Tomcat server will be running at port 9092.

#### Dockerize application

Openjob comes with a Dockerfile allowing the application to run on Docker containers

```
docker build -t openjob .
docker run --name openjob -dp 9092:9092 openjob
```

### Application architecture

![monolith-architecture](/docs/images/monolith-architecture.png)


### Data Model
![db-schema](/docs/images/openjob-db-schema.png)

### Exposed endpoints

- `/actuator`
    - `[GET] http://localhost:9092/actuator/health`
    - `[GET] http://localhost:9092/actuator/info`
- `/user`
    - `[GET, POST, PUT] http://localhost:9092/user`
    - `[GET, DELETE] http://localhost:9092/user/id/{id}`
    - `[GET] http://localhost:9092/user/username/{username}`
- `/job`
    - `[GET, POST, PUT] http://localhost:9092/job`
    - `[GET, DELETE] http://localhost:9092/job/{id}`
    - `[GET] http://localhost:9092/job/apply/{username}/{id}`

## Microservice application

TBD...
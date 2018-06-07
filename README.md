# Get Started with Spring Boot

Simple demos to get you started with Spring boot. The demos are written in Spring Boot v2.0.2. Maven is the preferred build system used in the demos. Docker is also in the mix if you prefer it. I have used projectLombok's @Data at some places because I was too tired of seeing the getters and setters.

## Basic Demo

A basic web application that has a RestController, custom banner and property file. You can run this demo using:
- Maven : mvn spring-boot:run
- Docker: docker-compose build & docker-compose up

## MySQL Demo

Extends the basic demo with MySQL database connection and JPA with ORM entities and repositories. Note that the database is initialized at runtime using the default schema.sql & data.sql files. You can run this demo using:
- Maven : mvn spring-boot:run
- Docker: docker-compose build & docker-compose up

Note that you have to ensure the database "student" to be present in the mySQL instance (to create the database use: CREATE DATABASE student). Access the mysql instance using:
- mysql -u root -p
For docker, you can access the mysql container using any of the following commands:
- docker exec -it kukkuz-mysql mysql -uroot -p
- mysql --host=127.0.0.1 --port=32768 -u root -p

## H2 Embedded Database Demo

Extends the basic demo with H2 database connection and JPA with ORM entities and repositories. H2 is an Java SQL database that is fast and has a very small footprint - you can run it as an in-memory or a file database. Note that the database is initialized at runtime using the default schema.sql & data.sql files. You can run this demo using:
- Maven : mvn spring-boot:run
- Docker: docker-compose build & docker-compose up

To access the database console, go to the uri /db and enter the credentials in application.yaml file. If you are running docker, see dev-env.env file.

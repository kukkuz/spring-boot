# Get Started with Spring Boot  

[![Build Status](https://travis-ci.org/kukkuz/spring-boot.svg?branch=master)](https://travis-ci.org/kukkuz/spring-boot)
[![Coverage Status](https://coveralls.io/repos/github/kukkuz/spring-boot/badge.svg?branch=master)](https://coveralls.io/github/kukkuz/spring-boot?branch=master)

Get started with simple demos in Spring boot. These demos are written in Spring Boot v2.0.2. Maven is the preferred build system used in the demos. Docker is also in the mix if you prefer it. Demos have been unit tested and coverage reports can be generated using Jacoco.

## Basic Demo

A basic web application that has a RestController, custom banner and property file. 

You can run this demo using:
- Maven : `mvn spring-boot:run`
- Docker: `docker-compose build & docker-compose up`

## H2 Embedded Database Demo

Extends the basic demo with H2 database connection and JPA with ORM entities and repositories. H2 is an Java SQL database that is fast and has a very small footprint - you can run it as an in-memory or a file database. Note that the database is initialized at runtime using the default `schema.sql` & `data.sql` files. 

You can run this demo using:
- Maven : `mvn spring-boot:run`
- Docker: `docker-compose build & docker-compose up`

To access the database console, go to the uri `/db` and enter the credentials in `application.yaml` file. If you are running docker, see `dev-env.env` environment file.

## MySQL Demo

Extends the basic demo with MySQL database connection and JPA with ORM entities and repositories. Note that the database is initialized at runtime using the default schema.sql & data.sql files. You can run this demo using:
- Maven : `mvn spring-boot:run`
- Docker: `docker-compose build & docker-compose up`

Note that you have to ensure the database "student" to be present in the mySQL instance (to create the database use: `CREATE DATABASE student`). 

Access the mysql instance using:
- `mysql -u root -p`

For docker, you can access the mysql container using any of the following commands:
- `docker exec -it kukkuz-mysql mysql -uroot -p`
- `mysql --host=127.0.0.1 --port=32768 -u root -p`

## MySQL Demo - with Flyway versioning

Extends the basic demo with MySQL database connection and JPA with ORM entities and repositories. Note that instead of initializing the database at runtime using the default schema.sql & data.sql files, flyway is used here for SQL versioning. You can add the below maven dependency and add the SQL scripts in `db/migration` path in the `resources` root.

        <dependency>
            <groupId>org.flywaydb</groupId>
            <artifactId>flyway-core</artifactId>
        </dependency>    


You can run this demo using:
- Maven : `mvn spring-boot:run`
- Docker: `docker-compose build & docker-compose up`

Note that you have to ensure the database "student_db" to be present in the mySQL instance (to create the database use: `CREATE DATABASE student_db`). 

Access the mysql instance using:
- `mysql -u root -p`

For docker, you can access the mysql container using any of the following commands:
- `docker exec -it kukkuz-mysql mysql -uroot -p`
- `mysql --host=127.0.0.1 --port=32768 -u root -p`

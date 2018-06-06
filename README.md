# spring-boot
Spring Boot Demos

# Basic Demo
   - RestController
   - Banner
   - Property file
   - Run
     - Maven : mvn spring-boot:run
     - Docker: docker-compose build
               docker-compose up

# mySQL Demo
   - mySQL
   - JPA
   - schema.sql & data.sql
   - projectLombok @Data - too idle to write getter(s)/setter(s)
   - Run
     - Maven : mvn spring-boot:run
     - Docker: docker-compose build
               docker-compose up
     - Note that you have to ensure the database "student" to be present in the mySQL instance (to create the database use: CREATE DATABASE `student`)
     - For docker, you can access the mysql container using any of the following commands:
       - docker exec -it kukkuz-mysql mysql -uroot -p
       - mysql --host=127.0.0.1 --port=32768 -u root -p

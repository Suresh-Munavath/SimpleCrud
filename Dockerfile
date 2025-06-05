FROM openjdk:17-alpine
EXPOSE 8080
COPY target/CRUD_Operations.jar spring-basic.jar
ENTRYPOINT ["java","-jar","spring-basic.jar"]

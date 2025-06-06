FROM openjdk:17-alpine
EXPOSE 8081
COPY target/CRUD_Operations.jar spring-basic.jar
ENTRYPOINT ["java","-jar","spring-basic.jar"]

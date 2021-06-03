FROM openjdk:14
ADD target/employee-backend.jar employee-backend.jar
EXPOSE 8085
ENTRYPOINT ["java","-jar","employee-backend.jar"]
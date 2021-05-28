FROM openjdk:8
EXPOSE 8085
ADD target/employeManager-0.0.1-SNAPSHOT.jar employeManager-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/employeManager-0.0.1-SNAPSHOT.jar"]
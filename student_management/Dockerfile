FROM openjdk:17-jdk-slim
COPY target/student_management-0.0.1-SNAPSHOT.jar studentManagement.jar
EXPOSE 8085
ENTRYPOINT ["java", "-jar", "studentManagement.jar"]
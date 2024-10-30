
FROM openjdk:21-jdk-slim

WORKDIR /app

COPY target/*.jar /app/app.jar


ENV SPRING_DATASOURCE_URL=jdbc:postgresql://postgres:5432/fullstack
ENV SPRING_DATASOURCE_USERNAME=postgres
ENV SPRING_DATASOURCE_PASSWORD=root


ENTRYPOINT ["java", "-jar", "/app/app.jar"]


EXPOSE 8080

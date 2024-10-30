
FROM openjdk:21-jdk-slim

WORKDIR /app

COPY target/*.jar /app/app.jar


ENV SPRING_DATASOURCE_URL=jdbc:postgresql://postgres:EYgFKsOBoAaAmYnEAjHjtGJixPkjdpRi@postgres.railway.internal:5432/railway
ENV SPRING_DATASOURCE_USERNAME=postgres
ENV SPRING_DATASOURCE_PASSWORD=EYgFKsOBoAaAmYnEAjHjtGJixPkjdpRi


ENTRYPOINT ["java", "-jar", "/app/app.jar"]


EXPOSE 8080

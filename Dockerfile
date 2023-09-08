# build stage
FROM eclipse-temurin:17-jdk-jammy

WORKDIR /usr/src/app

COPY . .

RUN ./mvnw clean package

EXPOSE 8080
CMD [ "java", "-jar", "target/api-v1.0.0.jar" ]

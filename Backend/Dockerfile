FROM openjdk:17-jdk-slim

WORKDIR /app

# Copier le JAR généré
COPY target/*.jar app.jar

EXPOSE 8080

# Attendre que la base soit prête
ENTRYPOINT ["java", "-jar", "app.jar"]

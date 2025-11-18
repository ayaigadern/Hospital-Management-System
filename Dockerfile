# Étape 1: Construction avec Maven
FROM maven:3.8-openjdk-11 AS build
WORKDIR /app
COPY src ./src
COPY pom.xml .
RUN mvn clean package

# Étape 2: Déploiement avec Tomcat
FROM tomcat:9.0-jre11
RUN rm -rf /usr/local/tomcat/webapps/*
COPY --from=build /app/target/HospitalSystemV2-1.0-SNAPSHOT.war /usr/local/tomcat/webapps/ROOT.war
EXPOSE 8080
CMD ["catalina.sh", "run"]
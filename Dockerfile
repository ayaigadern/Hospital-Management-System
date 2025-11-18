FROM tomcat:9.0-jre11

# Supprimer les applications exemple
RUN rm -rf /usr/local/tomcat/webapps/*

# Copier votre application DÉJÀ DÉPLOYÉE
COPY HospitalSystemV2-1.0-SNAPSHOT /usr/local/tomcat/webapps/HospitalSystemV2-1.0-SNAPSHOT

# Exposer le port 8080
EXPOSE 8080

# Démarrer Tomcat
CMD ["catalina.sh", "run"]
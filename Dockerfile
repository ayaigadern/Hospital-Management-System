# Runtime only – no Maven here
FROM tomcat:9.0-jre17

# Clean default apps
RUN rm -rf /usr/local/tomcat/webapps/*

# Copy WAR built by Jenkins
COPY target/HospitalSystemV2-1.0-SNAPSHOT.war \
     /usr/local/tomcat/webapps/ROOT.war

EXPOSE 8080

CMD ["catalina.sh", "run"]

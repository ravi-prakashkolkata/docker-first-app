FROM openjdk:8
COPY target/docker-first-app.jar .
EXPOSE 8484
ENTRYPOINT ["java","-jar","docker-first-app.jar"]
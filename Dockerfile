FROM openjdk:11
EXPOSE 8080
COPY target/ecafeteria-maven-docker-project.jar cafetaria.jar
CMD java -jar cafetaria.jar
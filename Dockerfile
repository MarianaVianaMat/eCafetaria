FROM openjdk:11

WORKDIR /app

COPY . /app

RUN ./mvnw install

EXPOSE 59001

#CMD ["./gradlew","runServer"]
CMD java -cp target\ecafeteria-0.0.1-SNAPSHOT.jar
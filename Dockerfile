FROM adoptopenjdk/openjdk11:latest
EXPOSE 8080
ARG JAR_FILE=target/starwars-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} starwars-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/starwars-0.0.1-SNAPSHOT.jar"]


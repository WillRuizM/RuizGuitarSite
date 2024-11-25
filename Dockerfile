FROM openjdk:23-jdk

WORKDIR /app

COPY pom.xml .
COPY mvnw .
COPY .mvn .mvn
COPY src ./src

RUN chmod 777 mvnw



run ls -l


CMD [ "java","-jar","target/crud-0.0.1-SNAPSHOT.war" ]

FROM maven:3.6.0-jdk-8-alpine AS build
COPY src /usr/src/app/src
COPY pom.xml /usr/src/app
RUN mvn -f /usr/src/app/pom.xml clean package

FROM openjdk:10
COPY --from=build /usr/src/app/target/Metamorphosys-1.0-SNAPSHOT.jar /usr/app/app.jar  
ENTRYPOINT ["java","-jar","/usr/app/app.jar"]  

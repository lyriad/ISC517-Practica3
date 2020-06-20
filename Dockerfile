FROM openjdk:11-jdk-slim

VOLUME /tmp

EXPOSE 8080

COPY /build/libs/isc517practica3-0.0.1-SNAPSHOT.jar isc517practica3.jar

CMD java -jar isc517practica3.jar
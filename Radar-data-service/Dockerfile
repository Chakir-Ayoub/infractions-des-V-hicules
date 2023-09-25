FROM openjdk:17-jdk-alpine
VOLUME /tmp
ADD  target/Radar*.jar /app.jar
CMD [ "java","-jar","/app.jar","--spring.profiles.active=prod"]
EXPOSE 8082
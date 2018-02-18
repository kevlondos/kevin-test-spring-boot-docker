FROM openjdk:8
ADD target/kevin-test-spring-boot-docker.jar kevin-test-spring-boot-docker.jar
EXPOSE 8085
ENTRYPOINT  ["java", "-jar", "kevin-test-spring-boot-docker.jar"]

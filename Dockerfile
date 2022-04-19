FROM openjdk:8-jdk-alpine
ADD target/data-process-service.jar data-process-service.jar


ENV JAVA_HOME=/usr/lib/jvm/java-1.8-openjdk


ENTRYPOINT ["java","-jar","data-process-service"]
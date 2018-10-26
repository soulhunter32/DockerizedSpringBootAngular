FROM openjdk:8-jdk-alpine

LABEL owner="Sebastian Kapcitzky <sebastian.kapcitzky@iridiuz.com>"

# Container's folder for the app 
ARG CONTAINER_APP_FOLDER=/usr/src/iridiuz/app

ARG DEPENDENCY=./target/dependency

COPY ${DEPENDENCY}/BOOT-INF/lib ${CONTAINER_APP_FOLDER}/lib
COPY ${DEPENDENCY}/META-INF ${CONTAINER_APP_FOLDER}/META-INF
COPY ${DEPENDENCY}/BOOT-INF/classes ${CONTAINER_APP_FOLDER}

ADD ./target/iridiuz-framework.war ${CONTAINER_APP_FOLDER}/iridiuz-framework.war

EXPOSE 5005
EXPOSE 8080

ENTRYPOINT [ "java", "-agentlib:jdwp=transport=dt_socket,server=y,suspend=y,address=5005", "-jar", "/usr/src/iridiuz/app/iridiuz-framework.war" ]
CMD [ "-e SPRING_PROFILES_ACTIVE=dev" ]
FROM openjdk:17-jdk-alpine
WORKDIR /pastebin/common
COPY target/pastebin-common.jar pastebin-common.jar

RUN pwd
RUN ls

EXPOSE 8084
ENTRYPOINT ["java", "-jar", "./pastebin-common.jar"]

FROM maven:latest
LABEL authors="ilkkasin"

WORKDIR /app
COPY pom.xml /app
COPY . /app
RUN mvn package
CMD [ "java", "-jar", "demo/target/converter.jar" ]


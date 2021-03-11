FROM adoptopenjdk:11-jre-hotspot
MAINTAINER Joseph <joseph89.dev@gmail.com>

ADD ./target/email-service-0.0.1-SNAPSHOT.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/email-service-0.0.1-SNAPSHOT.jar"]

EXPOSE 8082

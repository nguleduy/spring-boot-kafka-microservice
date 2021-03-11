FROM adoptopenjdk:11-jre-hotspot
MAINTAINER Joseph <joseph89.dev@gmail.com>

ADD ./target/email-service-0.0.1-SNAPSHOT.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/email-service-0.0.1-SNAPSHOT.jar"]

HEALTHCHECK --interval=10s --timeout=10s CMD curl -f http://localhost:8082/health || exit 1

EXPOSE 8082

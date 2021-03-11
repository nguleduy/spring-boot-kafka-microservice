FROM adoptopenjdk:11-jre-hotspot
MAINTAINER Joseph <joseph89.dev@gmail.com>

ADD ./target/eureka-server-0.0.1-SNAPSHOT.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/eureka-server-0.0.1-SNAPSHOT.jar"]

HEALTHCHECK --interval=10s --timeout=5s CMD curl -f http://localhost:8761/health || exit 1

EXPOSE 8761

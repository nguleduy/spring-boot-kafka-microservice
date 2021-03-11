FROM adoptopenjdk:11-jre-hotspot
MAINTAINER Joseph <joseph89.dev@gmail.com>

ADD ./target/ConfigServer-0.0.1-SNAPSHOT.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/ConfigServer-0.0.1-SNAPSHOT.jar"]

HEALTHCHECK --interval=10s --timeout=10s CMD curl -f http://192.168.99.100:8888/health || exit 1

EXPOSE 8888

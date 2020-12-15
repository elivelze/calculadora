FROM openjdk:8-jdk

RUN apt-get update && apt-get install -y --no-install-recommends openjfx && rm -rf /var/lib/apt/lists/*

ADD target/calculadora-0.0.1-SNAPSHOT.jar calculadora-0.0.1-SNAPSHOT.jar
ADD application-* /

ENV JAVA_OPTS=""
ENV SPRING_PROFILE="default"
ENV MONGO_PASSWORD=""

ENTRYPOINT exec java $JAVA_OPTS \
 -Dspring.profiles.active=XPROFILEX \
 -Dfile.encoding=UTF-8 \
 -jar calculadora-0.0.1-SNAPSHOT.jar

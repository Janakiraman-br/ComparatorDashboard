#docker file uses java 11 version
FROM openjdk:11-slim
RUN apt-get update && apt-get install -y wget && apt-get install -y libssl-dev
WORKDIR /usr/app
VOLUME /tmp
RUN addgroup --system --gid 1001 appuser && \
    adduser --system --uid  1001 --group appuser && \
    mkdir -p /usr/app && \
    chown -R appuser:appuser /usr/app
USER appuser
ADD ./target/athena-surchargecode-document-1.0.jar  /usr/app/app.jar
EXPOSE 8080
RUN wget -O dd-java-agent.jar 'https://repository.sonatype.org/service/local/artifact/maven/redirect?r=central-proxy&g=com.datadoghq&a=dd-java-agent&v=0.43.0'
ENV JAVA_OPTS="-Xms512m -Xmx2048m"
# env:dev,env:sit,env:preprod,env:prod
ENV DD_GLOBAL_TAG="env:dev"
ENTRYPOINT ["sh", "-c", "java $JAVA_OPTS -javaagent:dd-java-agent.jar -Ddd.service.name=athena-surchargecode-document \
            -Ddd.trace.global.tags=$DD_GLOBAL_TAG -Ddd.trace.enabled=true \
            -Ddd.logs.injection=true -jar /usr/app/app.jar"]
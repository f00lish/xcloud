FROM qnib/alpn-jre8
VOLUME /tmp
ADD *.jar app.jar
RUN bash -c 'touch /app.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom -Xmx200m","-jar","/app.jar"]

EXPOSE 8550
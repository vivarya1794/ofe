FROM azeastusitacr.azurecr.io/itbase-openjdk-17:v1
WORKDIR /home/workspace
ARG JAR=target
COPY ${JAR}/*.jar app/
USER root
#Changing permissions of Jar file
RUN chown -R spring:spring app/
USER spring:spring
WORKDIR /home/workspace/app
ENTRYPOINT [ "java","-jar","common-0.0.1-SNAPSHOT.jar" ]
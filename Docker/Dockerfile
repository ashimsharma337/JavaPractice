
#specify base image FROM ubuntu: latest, FROM node:12
FROM openjdk 

#WORKDIR in Dockerfile Instruction is used to set the working directory 
WORKDIR /usr/src/myapp 

#COPY in Dockerfile Instruction used to Copies a file or directory from host to Docker image 
# COPY <source>..<destination>
COPY . /usr/src/myapp 

# CMD in Dockerfile Instruction is used to execute a command in Running container, There should be one CMD
CMD ["java", "-jar", "server-0.0.1-SNAPSHOT.jar"]
EXPOSE 4040
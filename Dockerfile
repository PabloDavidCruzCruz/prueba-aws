FROM openjdk:11
ADD target/pabloyambar.jar pabloyambar.jar
ENTRYPOINT ["java", "-jar","pabloyambar.jar"]

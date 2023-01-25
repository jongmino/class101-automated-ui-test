FROM openjdk:17-jdk-slim

COPY . /app

WORKDIR /app

RUN apt-get update && apt-get install -y git


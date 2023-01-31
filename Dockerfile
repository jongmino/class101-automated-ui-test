FROM openjdk:17

COPY . /app

WORKDIR /app

RUN microdnf update && microdnf install -y git
#!/bin/bash

java -jar openapi-generator-cli-1.jar generate \
  -i src/main/resources/spec-for-client-generation/openapi.json \
  -g spring \
  -o src/main/java \
  -c config.json

cd src/main/java/
mvn clean package

cd target
java -jar university-api-0.0.1.jar
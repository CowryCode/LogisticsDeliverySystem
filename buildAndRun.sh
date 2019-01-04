#!/bin/sh
mvn clean package && docker build -t com.cowrycode/deliverysystem .
docker rm -f deliverysystem || true && docker run -d -p 8080:8080 -p 4848:4848 --name deliverysystem com.cowrycode/deliverysystem 

# event-driven-microservices
## Summary
Real time event-driven microservices architecture with patterns using twitter as the data source and 
utilized Java, Spring boot, Spring cloud, Kafka, Elasticsearch, Docker and PostgreSQL to enable the realtime functionality.

## Requirements
Need to install following dependencies to be able to run the project:

- Java 11
- Elasticsearch 7.9.1
- Spring boot 2.3.4.RELEASE
- Spring cloud 2.2.6.RELEASE
- Kafka 2.6.0
- PostgreSQL 15
- Docker

## How to get started

1. Modify the bootstrap.yml file to be able to fetch the latest config yaml files 

   Open `'./config-server/src/main/resources/bootstrap.yaml'`

   Modify `username` and `password`

2. Build project and docker images
   ```
   maven clean install
   ```
3. Run
   ```
   cd docker-compose
   docker-compose up
   ```

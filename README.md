# Currency Converter Microservices
 Microservices for currency conversion based on Spring Cloud, deployable with Docker and Kubernetes.

<br>

## Tech Stack:
- Language: Java 17
- Framework: Spring Cloud 2021.0.5, Spring Boot 2.7.6
- Centralized Configuration: Spring Cloud Config
- Service Registry: Eureka
- Load Distribution: Spring Cloud Load Balancer
- Tracing: Zipkin
- API Gateway: Spring Cloud Gateway
- Fault Tolerance: Resilience4j 

<br>

## Ports:
- Currency Exchange Microservice: 8000, 8001, 8002, ... 
- Currency Conversion Microservice: 8100, 8101, 8102, ...
- Limits Microservice: 8080, 8081, 8082, ... 
- Config Server: 8888  
- Service Registry: 8761 
- API Gateway: 8765
- Tracing Server: 9411

<br>

## Dokcer Images:
- Currency Exchange Microservice: ethanyixinsun/microservices-currency-exchange-service
- Currency Conversion Microservice: ethanyixinsun/microservices-currency-conversion-service
- Service Registry: ethanyixinsun/microservices-service-registry 
- API Gateway: ethanyixinsun/microservices-api-gateway

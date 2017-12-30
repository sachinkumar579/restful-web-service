This is a RESTful web service project

Frameworks and tools used

    Spring Boot to create Restful interface
    Spring Boot actuators for production ready inbuilt endpoints
    gradle for build
    
Endpoints available 
Production ready endpoints 
http://localhost:8080/health/
http://localhost:8080/info/
Service endpoints
http://localhost:8080/sayhello/

Launching the service : 

1.Download the zip from github 
2.Navigate to lib folder 
3.Open command prompt and run the below commamd 
    java -jar restful-web-service-0.0.1.jar
4.Open browser and launch below endpoints 
  To know the health of the application     http://localhost:8080/health/
  Provides more details about the service   http://localhost:8080/info/
  A very useless endpoint that does nothing http://localhost:8080/sayhello/



How To run 
 -> Run the below commands to launch the application
docker pull mongo:latest
docker run -d -p 27017:27017 --name target11mongodb mongo:latest 
docker build -t springemployeemanagement:1.0 .
docker run -p 9090:8080 --name springemployeemanagement --link target11mongodb:mongo -d springemployeemanagement:1.0


## Run the below commands to launch the application

docker pull mongo:latest  
docker run -d -p 27017:27017 --name target11mongodb mongo:latest  
docker build -t springemployeemanagement:1.0 .  
docker run -p 9090:8080 --name springemployeemanagement --link target11mongodb:mongo -d springemployeemanagement:1.0  


# Sample Curl

# Post : Creating and employee
curl --location 'localhost:9090/api/employees' \
--header 'Content-Type: application/json' \
--data-raw '{
  "id": "12345",
  "firstName": "John",
  "lastName": "Doe",
  "email": "johndoe@example.com",
  "department": "Engineering"
}'

# Get : fetching an employee based on the id 
curl --location 'localhost:9090/api/employees/12345'


# Get : fetching all employees
curl --location 'localhost:9090/api/employees'

# Run below command for port forwading
kubectl port-forward svc/employee-management-service 8080:8080
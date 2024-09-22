
## Run the below commands to launch the application

docker build -t springemployeemanagement:1.0 .  
Now go to docker-compose.yaml and execute below command  
docker-conpose up  

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

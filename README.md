
## Run the below commands to launch the application

docker build -t employee-service:1.1 .  
# Now go to docker-compose.yaml file path and execute below command  
docker-compose up  

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


# To make the containers down that was up using docker-compose
docker-compose down  

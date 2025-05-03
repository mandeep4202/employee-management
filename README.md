
## Run the below commands to launch the application

docker build -t employee-service:1.1 .  
# Now goto the deployment folder and run the following command in order
helm upgrade employee-service-release ./mychart


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


# To make the containers down that was up using above helm files 
helm uninstall  employee-service-release

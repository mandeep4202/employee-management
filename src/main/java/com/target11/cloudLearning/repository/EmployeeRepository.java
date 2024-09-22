package com.target11.cloudLearning.repository;



import com.target11.cloudLearning.entity.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeeRepository extends MongoRepository<Employee, String> {
}
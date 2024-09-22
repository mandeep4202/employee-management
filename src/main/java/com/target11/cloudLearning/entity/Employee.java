package com.target11.cloudLearning.entity;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "employees")
@Data
public class Employee {

    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private String department;


}
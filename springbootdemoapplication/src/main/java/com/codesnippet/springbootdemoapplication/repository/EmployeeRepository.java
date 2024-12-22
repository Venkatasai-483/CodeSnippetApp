package com.codesnippet.springbootdemoapplication.repository;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepository {
    public String getEmployee(Integer id){
        return "Employee Object";
    }
}

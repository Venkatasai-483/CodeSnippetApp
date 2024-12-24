package com.codesnippet.springbootdemoapplication.repository;

import com.codesnippet.springbootdemoapplication.entity.Employee;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepository {
    public Employee getEmployee(Integer id){
        return new Employee(1, "Sai", "Java Dev", 22);
    }
}

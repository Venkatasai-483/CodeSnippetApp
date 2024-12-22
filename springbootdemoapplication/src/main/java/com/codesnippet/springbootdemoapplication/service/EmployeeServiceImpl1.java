package com.codesnippet.springbootdemoapplication.service;

import com.codesnippet.springbootdemoapplication.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class EmployeeServiceImpl1 implements EmployeeService{

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public String getEmployee(Integer id) {
        return employeeRepository.getEmployee(id)+" Impl1";
    }
}

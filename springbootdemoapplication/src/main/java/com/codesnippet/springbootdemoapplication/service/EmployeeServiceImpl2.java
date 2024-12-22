package com.codesnippet.springbootdemoapplication.service;

import com.codesnippet.springbootdemoapplication.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl2 implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public String getEmployee(Integer id) {
        return employeeRepository.getEmployee(id) + " Impl2";
    }
}

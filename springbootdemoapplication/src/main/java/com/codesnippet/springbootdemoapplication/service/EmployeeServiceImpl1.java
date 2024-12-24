package com.codesnippet.springbootdemoapplication.service;

import com.codesnippet.springbootdemoapplication.dto.EmployeeDTO;
import com.codesnippet.springbootdemoapplication.entity.Employee;
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
    public EmployeeDTO getEmployee(Integer id) {
        Employee employee = employeeRepository.getEmployee(id);
        EmployeeDTO empDTO = new EmployeeDTO();
        return empDTO.EmployeeMapper(employee);
    }
}

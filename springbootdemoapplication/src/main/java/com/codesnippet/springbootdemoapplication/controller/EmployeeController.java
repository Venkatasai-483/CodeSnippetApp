package com.codesnippet.springbootdemoapplication.controller;

import com.codesnippet.springbootdemoapplication.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/emp")
public class EmployeeController {

    @Autowired
    @Qualifier("employeeServiceImpl2")
    private EmployeeService employeeService;

    @GetMapping("/getEmployee/{id}")
    public ResponseEntity<String> getEmployee(@PathVariable Integer id){
        String emp = employeeService.getEmployee(id);
        return ResponseEntity.ok(emp);
    }

}

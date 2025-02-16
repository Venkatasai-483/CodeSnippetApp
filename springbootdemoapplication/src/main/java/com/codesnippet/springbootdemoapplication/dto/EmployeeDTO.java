package com.codesnippet.springbootdemoapplication.dto;

import com.codesnippet.springbootdemoapplication.entity.Employee;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class EmployeeDTO {
    private String name;
    private String dept;
    private int age;

    public EmployeeDTO EmployeeMapper(Employee employee){
        this.setName(employee.getName());
        this.setDept(employee.getDept());
        this.setAge(employee.getAge());
        return this;
    }
}

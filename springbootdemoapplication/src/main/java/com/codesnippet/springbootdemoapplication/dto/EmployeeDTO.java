package com.codesnippet.springbootdemoapplication.dto;

import com.codesnippet.springbootdemoapplication.entity.Employee;
import lombok.Data;

@Data
public class EmployeeDTO {
    private String name;
    private String dept;
    private int age;

    public EmployeeDTO(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public EmployeeDTO EmployeeMapper(Employee employee){
        this.setName(employee.getName());
        this.setDept(employee.getDept());
        this.setAge(employee.getAge());
        return this;
    }
}

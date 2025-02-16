package com.codesnippet.springbootdemoapplication.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Entity
@Data
@AllArgsConstructor
public class Employee {
    @Id
    private Integer id;
    private String name;
    private String dept;
    private int age;
}

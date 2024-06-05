package com.example.spring_curd_examples.bean;

import jakarta.persistence.*;

@Entity
@Table(name="employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int empid;

    @Column
    private String name;

    @Column
    private  String department;

    @Column
    private String location;

    public Employee(String name, String department, String location) {
        this.name = name;
        this.department = department;
        this.location = location;
    }

    public int getEmpid() {
        return empid;
    }
}

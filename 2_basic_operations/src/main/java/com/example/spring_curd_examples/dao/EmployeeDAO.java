package com.example.spring_curd_examples.dao;

import com.example.spring_curd_examples.bean.Employee;

import java.util.List;

public interface EmployeeDAO {

    void save(Employee e);

    Employee findById(Integer empid);

    void update(Employee employee);

    void delete(Employee employee);

    List<Employee> getAllRecords();
}

package com.example.spring_curd_examples.controller;

import com.example.spring_curd_examples.bean.Employee;
import com.example.spring_curd_examples.dao.EmployeeDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    private EmployeeDAO employeeDAO;

    @Autowired
    public EmployeeController(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    @GetMapping("/")
    public String saveRecord()
    {
        Employee e = new Employee("Ajay","Finance","Mumbai");
        employeeDAO.save(e);
        return "Record inserted Successfully, Registration id is "+e.getEmpid();
    }
}

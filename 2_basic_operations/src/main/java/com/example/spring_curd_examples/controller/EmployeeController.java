package com.example.spring_curd_examples.controller;

import com.example.spring_curd_examples.bean.Employee;
import com.example.spring_curd_examples.dao.EmployeeDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    private EmployeeDAO employeeDAO;

    @Autowired
    public EmployeeController(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    @GetMapping("/save")
    public String saveRecord()
    {
        Employee e = new Employee("Akash","HR","Bhopal");
        employeeDAO.save(e);
        return "Record inserted Successfully, Registration id is "+e.getEmpid();
    }

    @GetMapping("/find")
    public String findRecord()
    {
        Employee employee =  employeeDAO.findById(1);
        return employee.toString();
    }

    @GetMapping("/update")
    public String updateRecord()
    {
        Employee employee =  employeeDAO.findById(2);
        employee.setName("Lokesh");
        employeeDAO.update(employee);
        return employee.toString();
    }

    @GetMapping("/delete")
    public String deleteRecord()
    {
        Employee employee =  employeeDAO.findById(2);
        employeeDAO.delete(employee);
        return "Record has been deleted";
    }

    @GetMapping("/allrecords")
    public String allRecord()
    {
        List<Employee> employeeList =  employeeDAO.getAllRecords();
        return employeeList.toString();
    }
}


package com.example.spring_curd_examples.dao;

import com.example.spring_curd_examples.bean.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO{

    private EntityManager entityManager;

    @Autowired
    public EmployeeDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public void save(Employee e) {
        entityManager.persist(e); // persist means to save an object
    }

    @Override
    public Employee findById(Integer empid) {
        return entityManager.find(Employee.class,empid);
    }

    @Override
    @Transactional
    public void update(Employee employee) {
        entityManager.merge(employee);
    }

    @Override
    @Transactional
    public void delete(Employee employee) {
        entityManager.remove(employee);
    }

    @Override
    public List<Employee> getAllRecords() {
        TypedQuery<Employee> tq = entityManager.createQuery("FROM Employee",Employee.class);
        List<Employee> employeeList = tq.getResultList();
        return  employeeList;
    }
}

package com.pharmacy.service;

import com.pharmacy.model.Employee;
import com.pharmacy.repository.EmpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.List;

@Service
public class EmpService {

    @Autowired
    EmpRepository empRepository;

    public List<Employee> getAllEmployees() {
        //System.out.println(empRepository.findAll());
        return empRepository.findAll();
    }

    public String addNewEmployee(Employee employee) {
        empRepository.save(employee);
        return "An employee with following parameters added successfully: " + employee;
    }

    public Employee getById(BigInteger id) throws NullPointerException {
        System.out.println("Service data: "+empRepository.findById(id).orElseThrow(NullPointerException::new));
        return empRepository.findById(id).orElseThrow(NullPointerException::new);

    }

}

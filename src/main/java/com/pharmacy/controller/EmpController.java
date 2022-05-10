package com.pharmacy.controller;

import com.pharmacy.mapping.EmpMapper;
import com.pharmacy.model.Employee;
import com.pharmacy.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/v1/employees")
public class EmpController {

    @Autowired
    EmpService empService;

    @GetMapping
    public ResponseEntity<List<Employee>> getAllEmployee(){
        return ResponseEntity.ok((empService.getAllEmployees()));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Employee> getEmployee(@PathVariable BigInteger id){
        Employee tmpEmp= new Employee();
        tmpEmp.setFullName("fff");
        empService.addNewEmployee(tmpEmp);
        System.out.println("Controller data: "+tmpEmp);
        return ResponseEntity.ok(tmpEmp);
    }

    @PostMapping
    public String addEmployee(@RequestBody Employee employee){

        return empService.addNewEmployee(employee);
    }
}

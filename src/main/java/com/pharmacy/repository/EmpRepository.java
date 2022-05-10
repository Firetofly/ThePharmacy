package com.pharmacy.repository;

import com.pharmacy.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

@Repository
public interface EmpRepository extends JpaRepository<Employee, BigInteger> {

}

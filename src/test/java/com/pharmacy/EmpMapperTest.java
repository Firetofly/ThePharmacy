package com.pharmacy;

import com.pharmacy.dto.EmpDTO;
import com.pharmacy.mapping.EmpMapper;
import com.pharmacy.mapping.EmpMapperImpl;
import com.pharmacy.model.Account;
import com.pharmacy.model.Employee;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class EmpMapperTest {

    @BeforeEach
    void beforeEach() {
        System.out.println("EmpMapperTest was started!");
    }

    @AfterEach
    void afterEach() {
        System.out.println("EmpMapperTest is successfully!");
    }

    EmpMapper empMapper = new EmpMapperImpl();


    @Test
    void empModelToDto() {
        //given
        Employee employee = new Employee();
        employee.setId(BigInteger.valueOf(Long.MAX_VALUE - 1));
        employee.setFullName("Testov Test Testovich");
        employee.setSalary(BigDecimal.valueOf(100000));
        employee.setEmpAccount(new Account());

        //when
        EmpDTO empDTO = empMapper.toDTO(employee);

        //then
/*        Assertions.assertNotNull(empDTO);
        Assertions.assertEquals(employee.getFullName(), empDTO.getFullName());
        Assertions.assertEquals(employee.getSalary(), empDTO.getSalary());
        Assertions.assertEquals(employee.getEmpAccount(), empDTO.getEmpAccount());*/
    }
}

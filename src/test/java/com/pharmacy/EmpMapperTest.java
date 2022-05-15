package com.pharmacy;

import com.pharmacy.dto.EmpDTO;
import com.pharmacy.mapping.EmpListMapper;
import com.pharmacy.mapping.EmpListMapperImpl;
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
import java.util.Collection;
import java.util.Collections;
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

    EmpListMapper empListMapper = new EmpListMapperImpl();

    @Test
    void empModelToDto() {
        //given
        Employee employee = new Employee();
        employee.setId(BigInteger.valueOf(Long.MAX_VALUE - 1));
        employee.setFullName("Testov Test Testovich");
        employee.setSalary(BigDecimal.valueOf(100000));
        employee.setEmpAccount(new Account());

        //when
        EmpDTO empDTO = empMapper.toEmpDTO(employee);

        //then
        Assertions.assertNotNull(empDTO);
        Assertions.assertEquals(employee.getFullName(), empDTO.getFullName());
        Assertions.assertEquals(employee.getSalary(), empDTO.getSalary());
        Assertions.assertEquals(employee.getEmpAccount(), empDTO.getEmpAccount());
    }

    @Test
    void empModelListToDto() {
        //given
        Employee employee1 = new Employee();
        employee1.setId(BigInteger.valueOf(Long.MAX_VALUE - 1));
        employee1.setFullName("Testov0 Test0 Testovich0");
        employee1.setSalary(BigDecimal.valueOf(100000));
        employee1.setEmpAccount(new Account());

        Employee employee2 = new Employee();
        employee2.setId(BigInteger.valueOf(Long.MAX_VALUE - 2));
        employee2.setFullName("Testov1 Test1 Testovich1");
        employee2.setSalary(BigDecimal.valueOf(99999));
        employee2.setEmpAccount(new Account());

        Employee employee3 = new Employee();
        employee3.setId(BigInteger.valueOf(Long.MAX_VALUE - 3));
        employee3.setFullName("Testov2 Test2 Testovich2");
        employee3.setSalary(BigDecimal.valueOf(99998));
        employee3.setEmpAccount(new Account());

        List<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);

        //when
        List<EmpDTO> empDTOList = empListMapper.toEmpDtoList(employeeList);

        //then
        Assertions.assertNotNull(empDTOList);
        Assertions.assertEquals(3, empDTOList.size());
        Assertions.assertEquals(empDTOList.get(0).getId(), employee1.getId());
        Assertions.assertEquals(empDTOList.get(1).getId(), employee2.getId());
        Assertions.assertEquals(empDTOList.get(2).getId(), employee3.getId());
        Assertions.assertEquals(empDTOList.get(0).getFullName(), employee1.getFullName());
        Assertions.assertEquals(empDTOList.get(1).getFullName(), employee2.getFullName());
        Assertions.assertEquals(empDTOList.get(2).getFullName(), employee3.getFullName());
        Assertions.assertEquals(empDTOList.get(0).getSalary(), employee1.getSalary());
        Assertions.assertEquals(empDTOList.get(1).getSalary(), employee2.getSalary());
        Assertions.assertEquals(empDTOList.get(2).getSalary(), employee3.getSalary());
        Assertions.assertEquals(empDTOList.get(0).getEmpAccount(), employee1.getEmpAccount());
        Assertions.assertEquals(empDTOList.get(1).getEmpAccount(), employee2.getEmpAccount());
        Assertions.assertEquals(empDTOList.get(2).getEmpAccount(), employee3.getEmpAccount());
    }
}

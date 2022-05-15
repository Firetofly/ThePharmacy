package com.pharmacy;

import com.pharmacy.dto.EmpDTO;
import com.pharmacy.mapping.EmpMapper;
import com.pharmacy.model.Account;
import com.pharmacy.model.Employee;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.math.BigInteger;

@SpringBootTest
class EmpDtoTest {

	@Autowired
	EmpMapper empMapper;

	@BeforeEach
	void beforeEach(){
		System.out.println("EmpDtoTest was started!");
	}

	@AfterEach
	void afterEach(){
		System.out.println("EmpDtoTest is successfully!");
	}

	@Test
	void contextLoads() {
	}

	@Test
	void testEmpModelToDto(){
		Employee employee = new Employee();
		employee.setId(BigInteger.valueOf(Long.MAX_VALUE-1));
		employee.setFullName("Testov Test Testovich");
		employee.setSalary(BigDecimal.valueOf(100000));
		employee.setEmpAccount(new Account());

		EmpDTO empDTO = empMapper.toEmpDTO(employee);

		Assertions.assertNotNull(empDTO);
		Assertions.assertEquals(employee.getFullName(), empDTO.getFullName());
		Assertions.assertEquals(employee.getSalary(), empDTO.getSalary());
		Assertions.assertEquals(employee.getEmpAccount(), empDTO.getEmpAccount());

	}

	@Test
	void testDtoToEmpModel(){
		EmpDTO empDTO = new EmpDTO();
		empDTO.setFullName("Test Testov Testovich");
		empDTO.setSalary(BigDecimal.valueOf(100000));
		empDTO.setEmpAccount(new Account());

		Employee employee = empMapper.toEmpModel(empDTO);

		Assertions.assertNotNull(empDTO);
		Assertions.assertEquals(empDTO.getFullName(), employee.getFullName());
		Assertions.assertEquals(empDTO.getSalary(), employee.getSalary());
		Assertions.assertEquals(empDTO.getEmpAccount(), employee.getEmpAccount());

	}

}

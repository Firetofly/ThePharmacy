package com.pharmacy.mapping;

import com.pharmacy.dto.EmpDTO;
import com.pharmacy.model.Employee;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", uses = EmpMapper.class, injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface EmpListMapper {

    List<EmpDTO> toEmpDtoList(List<Employee> employeeList);

    List<Employee> toEmpModelList(List<EmpDTO> empDTOList);

}

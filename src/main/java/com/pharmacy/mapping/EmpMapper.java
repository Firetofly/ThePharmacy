package com.pharmacy.mapping;

import com.pharmacy.dto.EmpDTO;
import com.pharmacy.model.Employee;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface EmpMapper {


    EmpDTO toEmpDTO(Employee employee);

    Employee toEmpModel(EmpDTO empDTO);
}

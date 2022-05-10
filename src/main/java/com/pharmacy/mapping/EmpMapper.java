package com.pharmacy.mapping;

import com.pharmacy.dto.EmpDTO;
import com.pharmacy.model.Employee;
import org.mapstruct.Mapper;

@Mapper
public interface EmpMapper {
    EmpDTO toDTO(Employee employee);
}

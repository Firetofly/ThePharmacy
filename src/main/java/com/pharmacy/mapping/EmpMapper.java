package com.pharmacy.mapping;

import com.pharmacy.dto.EmpDTO;
import com.pharmacy.model.Employee;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface EmpMapper {

    EmpDTO toDTO(Employee entity);
    List<EmpDTO> toDtoList(List<Employee> entityList);

}

package com.pharmacy.mapping;

import com.pharmacy.dto.RoleDTO;
import com.pharmacy.model.Role;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface RoleMapper {

    RoleDTO toDto(Role entity);

    List<RoleDTO> toDtoList(List<Role> entityList);
}

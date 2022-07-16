package com.pharmacy.mapping;

import com.pharmacy.dto.AccDTO;
import com.pharmacy.model.Account;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface AccMapper {

    AccDTO toDto(Account entity);

    List<AccDTO> toDtoList(List<Account> listEntity);



}

package com.pharmacy.mapping;

import com.pharmacy.dto.AccDTO;
import com.pharmacy.model.Account;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", uses = AccMapper.class, injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface AccListMapper {

    List<AccDTO> toAccDtoList(List<Account> accountList);

    List<Account> toAccModelList(List<AccDTO> accDTOList);
}

package com.pharmacy.mapping;

import com.pharmacy.dto.AccDTO;
import com.pharmacy.model.Account;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface AccMapper {

    AccDTO toAccDto(Account account);

    Account toAccModel(AccDTO accDTO);

}

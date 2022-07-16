package com.pharmacy.mapping;

import com.pharmacy.dto.ProviderDTO;
import com.pharmacy.model.Provider;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface ProviderMapper {

    ProviderDTO toDto(Provider entity);

    List<ProviderDTO> toDtoList(List<Provider> entityList);
}

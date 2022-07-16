package com.pharmacy.mapping;

import com.pharmacy.dto.SaleDTO;
import com.pharmacy.model.Sale;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface SaleMapper {

    SaleDTO toDto(Sale entity);

    List<SaleDTO> toDtoList(List<Sale> entityList);
}

package com.pharmacy.mapping;

import com.pharmacy.dto.ProdDTO;
import com.pharmacy.model.Product;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface ProductMapper {

    ProdDTO toDto(Product entity);

    List<ProdDTO> toDtoList(List<Product> entityList);
}

package com.pharmacy.mapping;


import java.io.Serializable;

public interface Mapper<E extends Serializable, D extends Serializable> {
    default void EntityToDto(E entity){
        return;
    }

    default void DtoToEntity(D dto){
        return;
    }
}

package com.pharmacy.dto;

import com.pharmacy.model.Product;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.math.BigInteger;
import java.util.List;

@Data
@Builder
public class ProviderDTO {

    @ToString.Exclude
    private BigInteger id;

    private String displayName;

    private String address;

    private List<Product> products;
}

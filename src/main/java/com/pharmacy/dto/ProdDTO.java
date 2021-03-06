package com.pharmacy.dto;

import com.pharmacy.model.Provider;
import com.pharmacy.model.Sale;
import lombok.Builder;
import lombok.ToString;

import java.math.BigInteger;
import java.util.List;

@Builder
public class ProdDTO {

    @ToString.Exclude
    private BigInteger id;

    private String displayName;

    private List<Sale> sales;

    private List<Provider> providers;
}

package com.pharmacy.dto;

import com.pharmacy.model.Account;
import com.pharmacy.model.Product;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.util.List;

@Data
@Builder
public class SaleDTO {

    @ToString.Exclude
    private BigInteger id;

    private LocalDate date;

    private BigDecimal price;

    private Account saleAcc;

    private List<Product> productList;
}

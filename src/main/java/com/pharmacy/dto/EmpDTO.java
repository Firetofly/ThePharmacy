package com.pharmacy.dto;

import com.pharmacy.model.Account;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;

@Data
@Builder
public class EmpDTO implements Serializable {

    @ToString.Exclude
    private BigInteger id;

    private String fullName;

    private BigDecimal Salary;

    private Account empAccount;
}

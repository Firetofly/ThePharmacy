package com.pharmacy.dto;

import com.pharmacy.model.Account;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;

@Data
public class EmpDTO implements Serializable {

    private BigInteger id;

    private String fullName;

    private BigDecimal Salary;

    private Account empAccount;
}

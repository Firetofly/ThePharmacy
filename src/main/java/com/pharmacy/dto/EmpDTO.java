package com.pharmacy.dto;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;

@Data
public class EmpDTO implements Serializable {

    private BigInteger id;

    private String fullName;

    private BigDecimal Salary;
}

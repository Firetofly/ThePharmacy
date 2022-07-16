package com.pharmacy.dto;

import com.pharmacy.model.Employee;
import com.pharmacy.model.Role;
import com.pharmacy.model.Sale;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.math.BigInteger;
import java.util.List;
import java.util.Set;

@Data
@Builder
public class AccDTO {

    @ToString.Exclude
    private BigInteger id;

    private String login;

    private char password;

    private Employee employee;

    private Set<Role> roles;

    private List<Sale> saleList;

}

package com.pharmacy.dto;

import com.pharmacy.model.Account;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.math.BigInteger;
import java.util.Set;

@Data
@Builder
public class RoleDTO {

    @ToString.Exclude
    private BigInteger id;

    private String displayName;

    private Set<Account> accounts;
}

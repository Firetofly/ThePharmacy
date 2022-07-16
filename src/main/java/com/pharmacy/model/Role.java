package com.pharmacy.model;

import lombok.*;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.Set;

@Data
@Entity
@Table(name = "Roles")
public class Role{

    @Id
    @ToString.Exclude
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private BigInteger id;

    @Column(name = "Display_name")
    private String displayName;

    @ToString.Exclude
    @ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinTable(
        name = "Account_roles",
        joinColumns = @JoinColumn(name = "id_role"),
        inverseJoinColumns = @JoinColumn(name = "id_account"))
    private Set<Account> roleAccounts;
}

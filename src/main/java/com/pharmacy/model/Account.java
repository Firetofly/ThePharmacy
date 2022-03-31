package com.pharmacy.model;

import lombok.*;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Entity
@Table(name = "Accounts")
public class Account{

    @Id
    private BigInteger id;

    private String login;

    private char password;

    @OneToOne(mappedBy = "account")
    private Employee employee;

    @ManyToMany(mappedBy = "roleAccounts")
    private Set<Role> roles;


/*    @Column(name = "Id_role")
    private BigInteger idRole;*/







}

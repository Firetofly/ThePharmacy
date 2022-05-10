package com.pharmacy.model;


import liquibase.pro.packaged.A;
import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Set;


@Data
@Entity
@Table(name = "Employees")
public class Employee {


    @Id
    @ToString.Exclude
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private BigInteger id;

    @Column(name = "full_name")
    private String fullName;

    private BigDecimal salary;

    @ToString.Exclude
    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name="id_account")
    private Account empAccount;

}

package com.pharmacy.model;


import liquibase.pro.packaged.A;
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
@Table(name = "Employees")
public class Employee {

    @Id
    //@GeneratedValue(GenerationType.SEQUENCE)
    private BigInteger id;

    private String firstName;

    private String middleName;

    private String lastName;

    private String salary;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="id_account", referencedColumnName = "id")
    private Account account;


   /* @Column(name = "Id_account")
    private BigInteger idAccount;*/


}

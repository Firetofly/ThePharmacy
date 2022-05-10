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
@Entity
@Table(name = "Employees")
public class Employee {


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private BigInteger id;

    @Column(name = "fullname")
    private String fullName;

    private String salary;

    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name="id_account")
    private Account empAccount;

    @Override
    public String toString() {
        return "Employee{" +
            "id=" + id +
            ", fullName='" + fullName + '\'' +
            ", salary='" + salary + '\'' +
            '}';
    }
}

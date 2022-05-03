package com.pharmacy.model;

import lombok.*;
import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Entity
@Table(name = "Accounts")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private BigInteger id;

    private String login;

    private char password;

    @ToString.Exclude
    @OneToOne(mappedBy = "empAccount", fetch = FetchType.EAGER)
    private Employee employee;

    @ToString.Exclude
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinTable(
        name = "Account_roles",
        joinColumns = @JoinColumn(name = "id_account"),
        inverseJoinColumns = @JoinColumn(name = "id_role"))
    private Set<Role> roles;

    @ToString.Exclude
    @OneToMany(mappedBy = "saleAcc", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Sale> sales;


}

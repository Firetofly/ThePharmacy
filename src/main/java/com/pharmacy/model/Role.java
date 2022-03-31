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
@Table(name = "Roles")
public class Role{

    @Id
    @Column(name = "ID")
    private BigInteger id;

    @Column(name = "Display_name")
    private String displayName;

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(name = "Account_roles",joinColumns = @JoinColumn(name = "id_Account"),
    inverseJoinColumns = @JoinColumn(name = "id_role"))
    @ToString.Exclude
    private Set<Account> roleAccounts;

        
}

package com.pharmacy.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigInteger;

@Entity
public class Products {
    @Id
    private BigInteger id;

    @Column(name = "display_Name")
    private String displayName;


}

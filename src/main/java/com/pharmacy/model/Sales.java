package com.pharmacy.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;

@Entity
public class Sales {
    @Id
    private BigInteger id;

    private LocalDate date;

    private BigDecimal price;

    /*RELATIONSHIP FOREIGN KEYS*/
}

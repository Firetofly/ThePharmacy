package com.pharmacy.repository;

import com.pharmacy.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

@Repository
public interface AccRepository extends JpaRepository<Account, BigInteger> {

}

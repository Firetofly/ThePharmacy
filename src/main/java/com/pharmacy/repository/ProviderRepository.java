package com.pharmacy.repository;

import com.pharmacy.model.Provider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

@Repository
public interface ProviderRepository extends JpaRepository<Provider, BigInteger> {
}

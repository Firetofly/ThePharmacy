package com.pharmacy.service;

import com.pharmacy.model.Account;
import com.pharmacy.model.Employee;
import com.pharmacy.repository.AccRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccService{

    @Autowired
    AccRepository accRepository;

    public List<Account> GetAllAccounts(){
        return accRepository.findAll();
    }

}

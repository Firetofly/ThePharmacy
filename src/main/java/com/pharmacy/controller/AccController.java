package com.pharmacy.controller;

import com.pharmacy.model.Account;
import com.pharmacy.service.AccService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1")
public class AccController {

    @Autowired
    AccService accService;

    @GetMapping("/accounts")
    public List<Account> getAllAccounts(){
     return accService.GetAllAccounts();
    }

}

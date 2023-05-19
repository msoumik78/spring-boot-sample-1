package org.example.controller;

import org.example.BankCustomer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/1/bank-customers")
public class BankCustomersController {


    @GetMapping(produces = {"application/json"})
    public BankCustomer getCustomerDetails() {
        return new BankCustomer("Bank Customer", 45, "Kolkata", "WB", "Software");
    }

}

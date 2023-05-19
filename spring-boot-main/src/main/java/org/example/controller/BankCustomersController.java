package org.example.controller;

import org.example.BankCustomer;
import org.example.services.BankCustomersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/1/bank-customers")
public class BankCustomersController {

    @Autowired
    BankCustomersService bankCustomersService;

    @GetMapping(value = "/{customerid}", produces = {"application/json"})
    public BankCustomer getCustomerDetails() {
        System.out.println("Get customer called");
        return null;
    }

    @PostMapping(produces = {"application/json"})
    public void createCustomer(@RequestBody BankCustomer bankCustomer) {
        System.out.println("Create customer called");
        bankCustomersService.createCustomer(bankCustomer);
    }

    @DeleteMapping(value = "/{customerid}", produces = {"application/json"})
    public void deleteCustomer() {
        System.out.println("Delete customer called");
    }

    @PutMapping(value = "/{customerid}", produces = {"application/json"})
    public void updateCustomer() {
        System.out.println("Update customer called");
    }

}

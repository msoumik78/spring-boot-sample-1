package org.example.services;

import org.example.BankCustomer;
import org.springframework.stereotype.Service;

@Service
public class BankCustomersService {

    public void createCustomer(BankCustomer bankCustomer) {
        DataHolder.bankCustomerList.add(bankCustomer);
    }

    public void getCustomerDetail(String bankCustomerName) {
        //DataHolder.bankCustomerList.add(bankCustomer);
    }

}

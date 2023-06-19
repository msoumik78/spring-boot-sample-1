package org.example.service;

import org.example.BankCustomer;
import org.example.dao.IDao;
import org.springframework.stereotype.Service;

@Service
public class BankCustomersService {

    private IDao iDao;

    public void createCustomer(BankCustomer bankCustomer) {
        iDao.createCustomer(bankCustomer);
    }

    public BankCustomer getCustomerDetail(String bankCustomerName) {
      return iDao.getCustomerDetail(bankCustomerName);
    }

    public void updateCustomer(String bankCustomerName, BankCustomer bankCustomerUpdated) {
        iDao.updateCustomerDetail(bankCustomerName, bankCustomerUpdated);
    }

    public void removeCustomer(String bankCustomerName) {
      iDao.removeCustomerDetail(bankCustomerName);
    }

}

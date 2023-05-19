package org.example.services;

import org.example.BankCustomer;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class DataHolder {

    public static List<BankCustomer> bankCustomerList = new CopyOnWriteArrayList<>();
}

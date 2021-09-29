package com.techelevator;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class BankCustomer {
    // Instance Variables

    private String name;
    private String address;
    private String phoneNumber;
    private List<Accountable> accounts = new ArrayList<>();


    // Methods
    public void addAccount(Accountable newAccount) {
        accounts.add(newAccount);
    }

    public boolean isVip() {
        int combinedTotal = 0;

        for (Accountable bothAccounts : accounts) {
            combinedTotal += bothAccounts.getBalance();
        }
        return (combinedTotal >= 25000);
    }


    // Getters
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Accountable[] getAccounts() {
        Accountable[] accountsArray = new Accountable[accounts.size()];
        accountsArray = accounts.toArray(accountsArray);
        return accountsArray;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


}

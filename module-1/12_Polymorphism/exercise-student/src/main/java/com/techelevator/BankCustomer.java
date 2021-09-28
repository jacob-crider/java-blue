package com.techelevator;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class BankCustomer {
    // Instance Variables

    private String name;
    private String address;
    private String phoneNumber;
    private ArrayList<Accountable> accounts = new ArrayList<>();


    // Methods
    public void addAccount(Accountable newAccount) {
        accounts.add(newAccount);
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

    public ArrayList<Accountable> getAccounts() {
        return accounts;
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

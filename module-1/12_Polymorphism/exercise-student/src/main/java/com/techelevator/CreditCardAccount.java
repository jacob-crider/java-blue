package com.techelevator;

public class CreditCardAccount implements Accountable {

    private String accountHolder;
    private String accountNumber;
    private int debt;


    public CreditCardAccount(String accountHolder, String accountNumber) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
    }

    // Methods
    public int getBalance() {
        return debt *= -1;
    }

    public int pay(int amountToPay) {
        return debt -= amountToPay;
    }

    public int charge(int amountToCharge) {
        return debt += amountToCharge;
    }

    // Getters
    public String getAccountHolder() {
        return accountHolder;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getDebt() {
        return debt;
    }


}

package com.techelevator;

public class CheckingAccount extends BankAccount {


    // Constructors
    public CheckingAccount(String accountHolderName, String accountNumber, int balance) {
        super(accountHolderName, accountNumber, balance);
    }

    public CheckingAccount(String accountHolderName, String accountNumber) {
        super(accountHolderName, accountNumber);
    }

    // Methods

    @Override
    public int withdraw(int amountToWithdraw) {
        int currentBalance = 0;
        if (getBalance() < 0 && getBalance() < -100) {
            return getBalance() - 10;
        } else {
            return currentBalance;
        }
    }
}


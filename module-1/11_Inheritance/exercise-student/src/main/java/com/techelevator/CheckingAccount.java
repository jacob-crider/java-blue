package com.techelevator;

public class CheckingAccount extends BankAccount {

    private int overDraftFee = 10;


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
        if (getBalance() < 0 && getBalance() < -100) {
            return getBalance() - overDraftFee;
        } if (getBalance() > 0 && amountToWithdraw < getBalance()) {
            return getBalance() - amountToWithdraw;
        }
        return getBalance();
    }
}


package com.techelevator;

public class SavingsAccount extends BankAccount {

    private int serviceFee = 2;

    // Constructors
    public SavingsAccount(String accountHolderName, String accountNumber, int balance) {
        super(accountHolderName, accountNumber, balance);
    }

    public SavingsAccount(String accountHolderName, String accountNumber) {
        super(accountHolderName, accountNumber);
    }

    @Override
    public int withdraw(int amountToWithdraw) {
        if (getBalance() < 150 && amountToWithdraw > 0) {
            return getBalance() - amountToWithdraw - serviceFee;
        }
        if (amountToWithdraw > getBalance()) {
        }
        return getBalance();
    }
}

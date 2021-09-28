package com.techelevator;

public class CheckingAccount extends BankAccount {

    private static final int OVERDRAFT_FEE = 10;

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
        if (getBalance() - amountToWithdraw > -100) {
            return super.withdraw(amountToWithdraw + OVERDRAFT_FEE);
        } if (getBalance() < 0 && amountToWithdraw < getBalance()) {
            return super.withdraw(amountToWithdraw);
        } else if (getBalance() <= 0 && amountToWithdraw >= 100) {
            return getBalance();
        }
        return getBalance();
    }
}


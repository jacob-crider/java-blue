package com.techelevator;

public class SavingsAccount extends BankAccount {

    private static final int SERVICE_FEE = 2;

    // Constructors
    public SavingsAccount(String accountHolderName, String accountNumber, int balance) {
        super(accountHolderName, accountNumber, balance);
    }

    public SavingsAccount(String accountHolderName, String accountNumber) {
        super(accountHolderName, accountNumber);
    }

    @Override
    public int withdraw(int amountToWithdraw) {
        if (getBalance() - amountToWithdraw < 150) {
            return super.withdraw(amountToWithdraw + SERVICE_FEE);
        }
        else if (getBalance() < 150 && getBalance() < 0) {
            return getBalance();
        }
        return super.withdraw(amountToWithdraw);
    }
}

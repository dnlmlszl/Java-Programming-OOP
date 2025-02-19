package org.helsinki_uni.oop.accounts;

public class Account {
    private String accountName;
    private Double balance;

    public Account(String accountName, Double balance) {
        this.accountName = accountName;
        this.balance = balance;
    }

    public void deposit(Double amount) {
        if (amount > 0) {
            this.balance += amount;
        }
    }

    public void withdraw(Double amount) {
        if (amount > 0 && this.balance >= amount) {
            this.balance -= amount;
        }
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return accountName + ": " + balance;
    }
}

package org.helsinki_uni.accounts;

import java.util.HashMap;

public class AccountManager {
    HashMap<String, Account> accounts;

    public AccountManager() {
        this.accounts = new HashMap<>();
    }

    public void addAccount(Account account) {
        if (!this.accounts.containsKey(account.getAccountName())) {
            accounts.put(account.getAccountName(), account);
        } else {
            System.out.println("Account already exists: " + account.getAccountName());
        }
    }

    public Account getAccount(String name) {
        return accounts.get(name);
    }

    public void printAllAccounts() {
        for (Account account : accounts.values()) {
            System.out.println(account);
        }
    }
}

package org.helsinki_uni.oop.accounts;

public class AccountMain {
    public static void main(String[] args) {
        AccountManager manager = new AccountManager();

        Account artosAccount = new Account("Arto's account", 100.00);
        Account artosSwissAccount = new Account("Arto's account in Switzerland", 1000000.00);

        manager.addAccount(artosAccount);
        manager.addAccount(artosSwissAccount);

        System.out.println("Initial state");
        manager.printAllAccounts();
        System.out.println("=============");

        artosAccount.withdraw(20.00);
        System.out.println("The balance of Arto's account is now: " + artosAccount.getBalance());
        artosSwissAccount.deposit(200.00);
        System.out.println("The balance of Arto's other account is now: " + artosSwissAccount.getBalance());
        System.out.println("=============");

        System.out.println("End state");
        manager.printAllAccounts();
        System.out.println("=============");
    }
}

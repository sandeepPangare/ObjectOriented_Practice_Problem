package com.bridgelabz;

import java.util.Scanner;

public class Account {

    Scanner sc = new Scanner(System.in);
    double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public void debit(double balance) {
        System.out.println("Enter amount to withdraw: ");
        double withdraw = sc.nextDouble();
        if (withdraw > balance)
            System.out.println("Debit amount exceeded account balance");
        else
            balance = balance - withdraw;
        System.out.println("Remaining balance is: " + balance);

    }
        public static void main(String[] args) {
        System.out.println("Enter the balance to Add in Your account: ");
        Scanner scanner = new Scanner(System.in);
        Account account = new Account(scanner.nextDouble());
        account.debit(account.balance);
    }
}

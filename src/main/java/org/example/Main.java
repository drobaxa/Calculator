package org.example;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.deposit(1000);
        System.out.println(bank.deposit(1000));
    }
}
package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner scanner = new Scanner(System.in);
        scanner.nextDouble();
        bank.deposit(scanner.nextDouble());
        bank.deposit(1000);
        bank.wyplata(500);
        System.out.println(bank);
    }
}
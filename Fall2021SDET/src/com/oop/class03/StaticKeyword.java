package com.oop.class03;

class Bank{
    int balance;
    static int numAcc;

    public void displayBalance(){
        System.out.println(balance);
        System.out.println(numAcc);
    }
}
public class StaticKeyword {
    public static void main(String[] args) {
        Bank b1 = new Bank();
        Bank b2 = new Bank();

        b1.balance = 20;
        b2.balance = 50;

        b1.numAcc = 1;
        b2.numAcc = 2;

        b1.displayBalance();

    }
}

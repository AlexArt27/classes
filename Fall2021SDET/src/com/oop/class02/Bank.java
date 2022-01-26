package com.oop.class02;

public class Bank {
    String branch = "cl";
    int balance = 1000;

    public void displayInfo(){
        System.out.println(branch);
        System.out.println(balance);
    }

    Bank(){
        System.out.println("ihi");
    }

    Bank(String branUs, int balanceUs){
        branch = branUs;
        balance = balanceUs;
        System.out.println("ihi");
    }
}

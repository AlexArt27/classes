package com.oop.class01;

public class Bank {

    String address;
    String accNum;
    String accName;
    String typeAcc;
    double balance;

    public  void withdraw(int amount){}
    public  void deposit(int amount){}
    public  void checkBal(){
        System.out.println(balance);
        System.out.println(accNum);
        System.out.println(accName);
        System.out.println(typeAcc);
    }

}

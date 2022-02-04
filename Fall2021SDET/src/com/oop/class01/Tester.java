package com.oop.class01;

public class Tester {
    public static void main(String[] args) {
        int i;
        Bank acc1 = new Bank();
        Bank acc2 = new Bank();

        acc1.balance = 1000;
        acc1.accName = "acc1";
        acc1.typeAcc = "save";
//        acc2 = acc1;

//        acc2.checkBal();


        acc2.balance = 5000;
        acc2.accName = "acc2";
        acc2.typeAcc = "save";

        acc1.checkBal();
    }
}

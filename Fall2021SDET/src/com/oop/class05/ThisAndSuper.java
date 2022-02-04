package com.oop.class05;

class Animal {
    int data = 5;  // INSTANCE

    public void printData() {
        System.out.println(data);
    }
}

class Cat extends Animal {
    int data = 6; // INSTANCE

    public void printData() {
        super.printData();
        System.out.println(data);
    }
}

public class ThisAndSuper {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.printData();
    }
}

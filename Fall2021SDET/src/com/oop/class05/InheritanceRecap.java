package com.oop.class05;

class Parent {
    int data = 5;  // INSTANCE
}

class Child extends Parent {
    int data = 6; // INSTANCE

    public void printDdata() {
        final int data = 10;  // LOCAL - scope of method(loops or IF conditions)
        System.out.println(this.data);
    }
}

public class InheritanceRecap {
    public static void main(String[] args) {
        Child c = new Child();
        c.printDdata();
    }
}

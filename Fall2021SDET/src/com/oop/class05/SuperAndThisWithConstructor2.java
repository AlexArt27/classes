package com.oop.class05;

class Vehicle{
    Vehicle(){
        System.out.println("car1");
    }
}

class Car extends Vehicle{
    int a;
    Car(){
        a = 10;
        System.out.println("car2");
    }
    Car(String carName){
        System.out.println("car3");
    }
}

public class SuperAndThisWithConstructor2 {
    public static void main(String[] args) {

        Car c = new Car("Audi");
        System.out.println(c.a);
    }
}

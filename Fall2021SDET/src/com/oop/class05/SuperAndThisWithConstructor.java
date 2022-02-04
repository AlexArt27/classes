package com.oop.class05;

class Bank{
    Bank(){
        System.out.println("From bank class");
    }
}

class HSBSCBank extends Bank{
    HSBSCBank(){

        System.out.println("From HSBNC bank class");
    }
}

class CitiBank extends HSBSCBank{
    CitiBank(){

        System.out.println("From Citi bank class");
    }
}

public class SuperAndThisWithConstructor {
    public static void main(String[] args) {
        HSBSCBank hscb = new CitiBank();
    }
}

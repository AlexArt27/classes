package com.oop.class10;

public class ThrowExample {
    public static void main(String[] args) {
        int dayNumber = 12;

        switch (dayNumber){
            case 0:
                System.out.println("Sun");
                break;
            case 1:
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("Tue");
                break;
            case 3:
                System.out.println("Wed");
                break;
            case 4:
                System.out.println("Thu");
                break;
            case 5:
                System.out.println("Fri");
                break;
            case 6:
                System.out.println("Sat");
                break;
            default:
                throw new RuntimeException("Enter valid");
        }
        System.out.println("we are using ");
    }
}

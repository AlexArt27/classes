package com.oop.class09;

public class ExampleException {
    public static void main(String[] args) {
        int a = 10, b = 0;

        int data[] = new int[5];
        String str = "hello";
        System.out.println("sdsd");
        try{
            System.out.println(a/b);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("eerr");
        }catch (ArithmeticException e){
            System.out.println("err2");
        }

        System.out.println("sdfeee");
    }
}

package com.oop.class09;

public class Task1 {
    public static void main(String[] args) {
        String str = "$12";

        try {
            Integer.parseInt(str);
        }catch (Exception e){
            System.out.println("Error");
        }
    }
}

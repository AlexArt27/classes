package com.oop.class10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class UseOfThrows {
    public static void main(String[] args) {
//        int a = 10, b = 0;
//
//        System.out.println("Hello world");
//        System.out.println(a/b);
//        try {
//            BufferedReader br = new BufferedReader(new FileReader(new File("")));
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }

//        method3();
    }
    public static void method1(){

    }
    public static void method2(){

    }
    public static void method3() throws FileNotFoundException{
        int i = 1;

        if(i!=0){
            throw new FileNotFoundException("I am not zero");
        }

    }
}

package com.oop.class04;

public class BasicCalc {
    public void sum(int a, int b){
        System.out.println(a+b);
    }

    public void sub(int a, int b){
        System.out.println(a-b);
    }
}

class AdvancedCalc extends BasicCalc{
    public void mul(int a, int b){
        System.out.println(a*b);
    }

    public void div(int a, int b){
        System.out.println(a/b);
    }

}

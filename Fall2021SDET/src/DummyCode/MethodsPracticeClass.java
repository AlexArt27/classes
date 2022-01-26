package DummyCode;

import java.util.Scanner;

public class MethodsPracticeClass {
    public static void main(String[] args) {
        printName();
        MethodsPracticeClass newObj = new MethodsPracticeClass();
        newObj.printAge(32);
        printQuote();
    }

    public static void printName(){
        System.out.println("Sasha");
    }

    public void printAge(int age){
        System.out.println(age - 10);
    }


    private static void printQuote(){
        Scanner input = new Scanner(System.in);
        System.out.println("Fav quote?: ");
        String quote = input.nextLine();
        System.out.println(quote);
    }
}

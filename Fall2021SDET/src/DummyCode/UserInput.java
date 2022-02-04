package DummyCode;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {

        System.out.println(UserInput());
    }
    static String UserInput(){
        Scanner inp = new Scanner(System.in);

        System.out.println("Put first: ");
        String str1 = inp.next().toUpperCase();
        System.out.println("First: " + str1);

        System.out.println("Put second: ");
        String str2 = inp.next().toUpperCase();
        System.out.println("Second: " + str2);

        if(str1.equals(str2)){
            return "match";
        }else {
            return "no match";
        }
    }
}

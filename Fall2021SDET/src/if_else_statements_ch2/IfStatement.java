package if_else_statements_ch2;

import java.util.Scanner;

public class IfStatement {

    public static void main(String[] args) {
        String welcomeMessage = "Welcome here)) your age: ";
        System.out.println(welcomeMessage);
        Scanner input = new Scanner(System.in);
        short age = input.nextShort();

        if(age >= 18){
            System.out.println("welcomeMessage");
        }else{
            System.out.println("go away");
        }
    }


}

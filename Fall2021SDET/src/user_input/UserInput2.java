package user_input;

import java.util.Scanner;

public class UserInput2 {
    public static void main(String[] args) {
//        scanner class does not have nextChar() method to take input
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your grade");
        String str = scan.nextLine();
//        char grade = scan.nextChar(); ---- there is no nextChar() method

        char grade = scan.next().charAt(2);
        System.out.println(grade);

    }
}

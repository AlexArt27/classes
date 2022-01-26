package user_input;
import java.util.Scanner;
public class ScannerClass {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Put your first Name");
        String firstName = scan.next();
        System.out.println("first name is:" + firstName);

//        String lastName = scan.next();
//        or
        String lastName = new Scanner(System.in).next();
        System.out.println("last name is:" + lastName);
        scan.nextLine();


        System.out.println("Your full name: ");
        String fullName = scan.nextLine();
        System.out.println(fullName);
    }
}

package operators;

import java.util.Scanner;

public class oct18 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        char in = 'U';
        String yourName;
        yourName = in == 'U' ? "BAHA USON" : "baha uson";
        System.out.println(yourName);

        char gender;

        String f = "Female";
        String m = "Male";

        gender = scan.next().toUpperCase().charAt(0);

        String message = gender == 'F' ? f : m;
        System.out.println(message);
    }
}

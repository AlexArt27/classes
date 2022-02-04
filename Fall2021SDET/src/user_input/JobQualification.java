package user_input;

import java.util.Scanner;

public class JobQualification {
    public static void main(String[] args) {
        System.out.println("HI");

        Scanner input = new Scanner(System.in);

        System.out.println("name full");
        String name = input.nextLine();

        System.out.println("your age");
        short age = input.nextShort();

        System.out.println("experiencel");
        byte years = input.nextByte();

        System.out.println("eligible? Y or N");
        char workEligible = input.next().charAt(0);
        boolean isEligible = workEligible == 'y' || workEligible == 'Y' ? true : false;

        System.out.println("compensation?");
        double compensation = input.nextDouble();

        System.out.println("Your info: \n"
                + name + "\n"
                + age + "\n"
                + years + "\n"
                + "eligible to work: " + (isEligible == true ? "Yes" : "No") + "\n"
                + compensation + "\n"
        );
    }
}

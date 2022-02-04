package DummyCode;

import java.util.Locale;
import java.util.Scanner;

public class DummyCode3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String itemOptions = "Please choose A, B or C:\n";
//        int burAmount = 0;
//        int saladAmount = 0;
//        int drinkAmount = 0;

        String orderItems = "";

        String burgerMenu = itemOptions +
                "A. Cheeseburger $0.99\n" +
                "B. McChicken $1.99\n" +
                "C. Big Mac $3.99";

        String drinkMenu = itemOptions +
                "A. Coke $0.49\n" +
                "B. Diet Coke $0.49\n" +
                "C. Sprite $0.49";

        String saladMenu = itemOptions +
                "A. Caesar $2.49\n" +
                "B. Grilled Chicken $3.49\n" +
                "C. Green salad $2.99";

        double cheeseBurgerPrice = 0.99;
        double mcChickenPrice = 1.99;
        double bigMacPrice = 3.99;

        double cokePrice = 0.49;
        double dietCokePrice = 0.49;
        double spritePrice = 0.49;

        double caesarPrice = 2.49;
        double grilledChickenPrice = 3.49;
        double greenSaladPrice = 2.99;
        double totalPrice = 0;


        System.out.println("Welcome");
        System.out.println("Burger?:");
        char burgYN = input.next().toLowerCase().charAt(0);


        if (burgYN == 'y'){
            System.out.println(burgerMenu);
            char burgOption = input.next().toUpperCase().charAt(0);
            System.out.println("How many?");

            int burAmount = input.nextInt();

            switch (burgOption){
                case 'A':
                    totalPrice += cheeseBurgerPrice * burAmount;
                    orderItems += "CheeseBurg \n";
                    System.out.println(totalPrice);
                    break;
                case 'B':
                    totalPrice += mcChickenPrice * burAmount;
                    orderItems += "Chicken \n";
                    break;
                case 'C':
                    totalPrice += bigMacPrice * burAmount;
                    orderItems += "BigMAc \n";
                    break;
                default:
                    System.out.println("Choose what shown");
            }

        }
        System.out.println("Salad? Y N");
        char saladYN = input.next().toLowerCase().charAt(0);

        if (saladYN == 'y'){
            System.out.println(saladMenu);
            char saladOption = input.next().toUpperCase().charAt(0);

            System.out.println("How many?");
            int saladAmount = input.nextInt();

            switch (saladOption){
                case 'A':
                    totalPrice += caesarPrice * saladAmount;
                    orderItems += "cesar \n";
                    System.out.println(totalPrice);
                    break;
                case 'B':
                    totalPrice += grilledChickenPrice * saladAmount;
                    orderItems += "chick salad \n";
                    break;
                case 'C':
                    totalPrice += greenSaladPrice * saladAmount;
                    orderItems += "GreenSalad \n";
                    break;
                default:
                    System.out.println("Choose what shown");
            }
        }

        System.out.println("Drink? Y N");
        char drinkYN = input.next().toLowerCase().charAt(0);

        if (drinkYN == 'y'){
            System.out.println(drinkMenu);
            char drinkOption = input.next().toUpperCase().charAt(0);

            System.out.println("How many?");
            int drinkAmount = input.nextInt();

            switch (drinkOption){
                case 'A':
                    totalPrice += cokePrice * drinkAmount;
                    orderItems += "coke \n";
                    System.out.println(totalPrice);
                    break;
                case 'B':
                    totalPrice += dietCokePrice * drinkAmount;
                    orderItems += "diet \n";
                    break;
                case 'C':
                    totalPrice += spritePrice * drinkAmount;
                    orderItems += "sprite \n";
                    break;
                default:
                    System.out.println("Choose what shown");
            }
        }
        System.out.println("Order details: ");
        System.out.println(orderItems + "\n");
        System.out.printf("your total is %.2f ", totalPrice);

    }
}

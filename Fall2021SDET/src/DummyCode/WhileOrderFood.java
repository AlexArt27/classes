package DummyCode;

import java.util.Scanner;

public class WhileOrderFood {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Order: ");
        StringBuilder order = new StringBuilder();



        order.append(scan.nextLine());

        System.out.println("More? ");

        String moreItems = scan.nextLine();

        if(moreItems.equalsIgnoreCase("yes")){
            addMoreItems(order);
        }
    }
    static StringBuilder addMoreItems(StringBuilder order){
        System.out.println("what?");
        return order.append(scan.nextLine()).append("\n");
    }

}

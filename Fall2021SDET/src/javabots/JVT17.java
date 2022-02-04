package javabots;

import java.util.*;
import java.util.Set;

public class JVT17 {
    public static void main(String[] args) {

        Set<String> menu = new LinkedHashSet<>();

        buildMenu(menu);

        System.out.println(menu);

        printMenu(menu);

    }

    public static Set<String> buildMenu(Set<String> menuParameter) {

        Scanner inp = new Scanner(System.in);

        String response = "";

        do {
            System.out.println("What food would you like to add?");

            String getItem = inp.nextLine().trim();

            if (getItem.length() > 0) {

                if (menuParameter.add(getItem)) {
                    menuParameter.add(getItem);
                    System.out.println("Great, menu was updated!");
                } else {
                    System.out.println("Ooops, " + getItem + " exists in your menu");
                }

                System.out.println("Would you like to add more items? Please respond yes or no");

                response = inp.nextLine().trim();

            }
        } while (response.equalsIgnoreCase("yes"));

        return menuParameter;
    }

    public static void printMenu(Set<String> menuParameter) {

        List<String> menuList = new ArrayList<>(menuParameter);

        for (int i = 0; i < menuList.size(); i++) {
            System.out.println(i + 1 + "." + " " + "\"" + menuList.get(i).substring(0, 1).toUpperCase() + menuList.get(i).substring(1) + "\"");
        }

    }
}

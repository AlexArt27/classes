package DummyCode;

import java.util.Scanner;

public class WhileReverse {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter");
        String s = scan.nextLine();

        System.out.println(revString(s));
    }

    static StringBuilder revString(String str){
        StringBuilder sb = new StringBuilder();

        int index = str.length()-1;

        while (index >= 0){
            sb.append(str.charAt(index));
            index--;
        }
        return sb;
    }
}

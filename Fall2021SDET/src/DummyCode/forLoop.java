package DummyCode;

import java.util.Scanner;
import java.util.jar.JarOutputStream;

public class forLoop {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter:");
        String wordOrSentence = scan.nextLine();
        System.out.println("what to lok for?");
        char target = scan.nextLine().charAt(0);

        System.out.println(findNumOfTimesFromString(wordOrSentence, target));
    }

    public static int findNumOfTimesFromString(String str, char c){
        int numOfTimes = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == c){
                numOfTimes++;
            }
        }
        return numOfTimes;
    }

}

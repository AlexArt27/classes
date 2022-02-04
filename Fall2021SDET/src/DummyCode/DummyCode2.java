package DummyCode;

import java.util.Locale;
import java.util.Scanner;
import java.util.TreeMap;

public class DummyCode2 {
    public static void main(String[] args) {
        /* Tell students which classes they have to take.

What major are you in?
- accounting -> year 1 and 2 should take Math 1 and Math 2, Calculus;
        -> year 3 and 4 -> Excel, Macro and Micro economics;
- Software eng -> year 1 and 2 should take Math 1 and Math 2, Calculus;
        -> year 3 and 4 -> Java, Database, Cybersecurity;
- psychology -> year 1 and 2 should take Public speaking, Body languages;
          -> year 3 and 4 -> Psychology, Neuroscience;
 */

        Scanner input = new Scanner(System.in);

        // Input for major

        System.out.println("Major:");
        String major = input.nextLine().toLowerCase();

        System.out.println("Years:");
        int years = input.nextInt();

        String course = "";
        String errorMess = "1-4 only";

        switch (major){
            case "accounting":
                switch (years){
                    case 1:
                    case 2:
                        course = "Math 1 and Math 2, Calculus";
                        break;
                    case 3:
                    case 4:
                        course = "Excel, Macro and Micro economics";
                        break;
                        default:
                            System.out.println(errorMess);
                            break;

                }
                break;
            case "software eng":
                switch (years){
                    case 1:
                    case 2:
                        course = "Math 1 and Math 2, Calculus";
                        break;
                    case 3:
                    case 4:
                        course = "Java, Database, Cybersecurity";
                        break;
                    default:
                        System.out.println(errorMess);
                        break;

                }
                break;
            case "psychology":
                switch (years){
                    case 1:
                    case 2:
                        course = "Public speaking, Body languages";
                        break;
                    case 3:
                    case 4:
                        course = "Psychology, Neuroscience";
                        break;
                    default:
                        System.out.println(errorMess);
                        break;
                }
                break;
            default:
                System.out.println("Wrong course");
        }
        System.out.println(course);

    }
}

package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class NestedArrayList {
    public static void main(String[] args) {


        ArrayList<String> school1 = new ArrayList<>(Arrays.asList("School1","School2","School3"));
        ArrayList<String> school2 = new ArrayList<>(Arrays.asList("School4","School5","School6"));

        ArrayList<ArrayList<String>> schoolList = new ArrayList<>();

        schoolList.add(school1);
        schoolList.add(school2);

        System.out.println(school1);
        System.out.println(school2);
        System.out.println(schoolList);

        for (int i = 0; i < schoolList.size(); i++) {
            for (int j = 0; j < schoolList.get(i).size(); j++) {
                schoolList.get(i).set(j, ("$"+schoolList.get(i).get(j)));
            }
        }

        System.out.println(schoolList);

    }
}

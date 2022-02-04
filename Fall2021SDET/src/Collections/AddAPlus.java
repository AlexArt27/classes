package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddAPlus {
    public static void main(String[] args) {
        List<String> wordsList = new ArrayList<>(Arrays.asList("Alpha", "Beta","Gamma"));

        System.out.println("Initial list: " + wordsList);
        System.out.println("After: " + addPlusToElements((ArrayList<String>) wordsList));
    }

    public static ArrayList<String> addPlusToElements(ArrayList<String> list){
        for (int i = 0; i < list.size(); i++) {
            list.set(i,list.get(i).concat("+"));
        }
        return list;
    }
}

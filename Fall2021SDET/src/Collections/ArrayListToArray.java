package Collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListToArray {

    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>(){

            {
                add("red");
                add("blue");
                add("yellow");
                add("Green");

            }

        };

        Object[] colorsArray = colors.toArray();

        System.out.println(colorsArray.length);

        for (Object color : colors){
            System.out.println(color);
        }

        String colorBlue = (String) colorsArray[1];

        String[] colorsStrArray = colors.toArray(new String[0]);

//        String[] colorsArrayString = (String[]) colors.toArray();

        System.out.println(Arrays.toString(colorsStrArray));
    }
}

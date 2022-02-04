package Collections;

import java.util.ArrayList;

public class DigitsInArrayList {

    public static void main(String[] args) {
        // write a method that takes ArrayList as a parameter
        // and returns and ArrayList with the numbers from given arrayList

        ArrayList<String> strList = new ArrayList<>();

        strList.add("DevX 56 school");
        strList.add("Yale 78 Garden");
        strList.add("Stanford 93 Fields");

        System.out.println(findNumber(strList));
    }

    public static ArrayList<Integer> findNumber(ArrayList<String> listOfStrings){
        ArrayList<Integer> numbersList = new ArrayList<>();

        for (int i = 0; i < listOfStrings.size();i++){
            String tempString = listOfStrings.get(i);

            for (int j = 0; j < tempString.length();j++){

                char tempChar = tempString.charAt(j);

                if (Character.isDigit(tempChar)){
                    numbersList.add(Character.getNumericValue(tempChar));
                }
            }
        }
        return numbersList;
    }

}

package Collections.Set;

import java.util.ArrayList;

public class MultiplesOf3And6 {

    /*
    CReate a method that returns and arraylist of integers which are multiples of 3 and 6 from 0-200
    */

    public static void main(String[] args) {

        System.out.println(findMultip());
    }

    public static ArrayList<Integer> findMultip(){
        ArrayList<Integer> multiples = new ArrayList<>();

        int counter = 0;
        for (int i = 0; i < 200; i++) {
            if(i%6==0){
                multiples.add(i);
            }
        }
        return multiples;
    }
}

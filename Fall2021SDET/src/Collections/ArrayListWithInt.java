package Collections;

import java.util.ArrayList;

public class ArrayListWithInt {

    public static void main(String[] args) {

        ArrayList<Integer> testScores = new ArrayList<>();

        testScores.add(96);
        testScores.add(75);
        testScores.add(68);
        testScores.add(90);

        testScores.set(2, testScores.get(2) + 5);

        System.out.println(testScores);

    }
}

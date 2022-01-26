package DummyCode;

import java.util.Arrays;

public class SortingInts {

    public static void main(String[] args) {

        int[] scores = {75, 78, 98, 95, 84, 65};
        System.out.println("before: " + Arrays.toString(scores));
        Arrays.sort(scores);
        System.out.println("after: " + Arrays.toString(scores));

    }
}

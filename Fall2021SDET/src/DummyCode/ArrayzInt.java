package DummyCode;

import java.util.Arrays;

public class ArrayzInt {

    public static void main(String[] args) {
        int[] num = new int[5];

        num[1] = 5;
        num[1] = 7;
        num[2] = 9;

        System.out.println(Arrays.toString(num));


        int sum = num[1] + num[2];

        System.out.println(sum);

    }
}

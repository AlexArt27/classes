package DummyCode;

import java.util.Arrays;

public class
ArrayElemCopyInLoop {

    public static void main(String[] args) {

        int[] numbers = {8,4,3,9,7};
        System.out.println("before " + Arrays.toString(numbers));

        int[] number2 = new int[numbers.length];
        System.out.println("before2 " + Arrays.toString(number2));

        for(int i = 0; i < numbers.length; i++){

            number2[i] = numbers[i];
        }
        System.out.println("after2 " + Arrays.toString(number2));
    }
}

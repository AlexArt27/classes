package DummyCode;

import java.util.Arrays;

public class ArraysCopy {
    public static void main(String[] args) {
        int[] nums = {3,2,4,7,8};
        int[] numsCopy = nums;

        System.out.println("Before change: " + Arrays.toString(nums));
        System.out.println("before " + Arrays.toString(numsCopy));

        nums[1] = 8;
        System.out.println("after change: " + Arrays.toString(nums));
        System.out.println("after " + Arrays.toString(numsCopy));

        int[] temps = {65,73,48,92};
        int[] tempsCopy = new int[temps.length];

        System.out.println("Before change: " + Arrays.toString(temps));
        System.out.println("before " + Arrays.toString(tempsCopy));

        tempsCopy = Arrays.copyOf(temps, temps.length);

        System.out.println("after co " + Arrays.toString(tempsCopy));



    }
}

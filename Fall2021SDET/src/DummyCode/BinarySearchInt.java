package DummyCode;

import java.util.Arrays;

public class BinarySearchInt {

    public static void main(String[] args) {
        int[] ids = {56,78,12,34,99};
        System.out.println("before sort " + Arrays.binarySearch(ids,12));
        Arrays.sort(ids);
        System.out.println("after " + Arrays.binarySearch(ids,12));
    }
}

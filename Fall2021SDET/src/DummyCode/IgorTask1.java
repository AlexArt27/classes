package DummyCode;

import java.util.Arrays;

public class IgorTask1 {
    public static void main(String[] args) {
        Integer[] arr = {3,5,-4,8,11,1,-1,6};
        int targetSum = 10;
        int[]returnArr = new int[2];

        for (int indFirst : arr) {
            for (int indSecond : arr){
                if(Arrays.asList(arr).indexOf(indFirst) == Arrays.asList(arr).indexOf(indSecond)){
                    continue;
                }
                else if(indFirst+indSecond==targetSum){
                    returnArr[0] = indFirst;
                    returnArr[1] = indSecond;
                }
            }
        }
        System.out.println(Arrays.toString(returnArr));

        System.out.println("--------------------------------------------------------");

        int[] array = {3,5,-4,8,11,1,-1,6};
        int[] result = new int[2];
        int targetSumToFind = 0;
        for (int i = 0; i < array.length; i++) {
            targetSumToFind = targetSum - array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (targetSumToFind == array[j]) {
                    result[0] = array[i];
                    result[1] = array[j];
                }
            }
        }
        System.out.println(Arrays.toString(result));

    }
}

package DummyCode;

import java.util.Arrays;

public class ArrayTask {
    public static void main(String[] args) {
        String[] cities = {"Los Angeles", "San Francisco", "Chicago", "New York", "Boston", "London"};

        System.out.println(Arrays.toString(countNumberOfL(cities)));
    }

    public static int[] countNumberOfL(String[] arr){

        int[] numberOfChars = new int[arr.length];

        for(int i=0;i<=numberOfChars.length-1;i++){
            int counter = 0;

            for(int j=0;j<arr[i].length();j++){
                if(arr[i].charAt(j) == 'l' || arr[i].charAt(j) == 'L'){

                    counter++;
                }

            }
            numberOfChars[i] = counter;
        }
        return numberOfChars;
    }
}

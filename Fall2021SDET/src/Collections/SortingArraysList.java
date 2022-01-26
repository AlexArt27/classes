package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingArraysList {
    public static void main(String[] args) {
        List<String> citiesList = Arrays.asList("Chicago","LA","SF","SD","Buffalo","Denver");

        System.out.println(citiesList);

        Collections.sort(citiesList);

        System.out.println(citiesList);

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(56,67,34,232,121,54,67));

        Collections.sort(numbers);

        System.out.println(numbers);

        int[] arr = {3,4,54,3,5,4,87,67,566,565,-76,-77,-889};

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

        int max = arr[arr.length-1];

        System.out.println("biggest " + max);
        System.out.println("smallest " + arr[0]);

        System.out.println("Three biggest " + arr[arr.length-1]+ "," + arr[arr.length-2]+ "," + arr[arr.length-3]);

        List<Integer> nimberList = new ArrayList<>();

        
    }
}

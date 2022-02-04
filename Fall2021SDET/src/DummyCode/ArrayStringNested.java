package DummyCode;

import java.util.Arrays;
import java.util.Locale;

public class ArrayStringNested {
    public static void main(String[] args) {

        String[] cities = {"Chicago", "Seattle", "San Francisco", "New York", "Austin", "New Zealand"};

        int[] indicesOfCharA = new int[cities.length];

        int indexOfA;
        for (int i = 0; i < cities.length; i++){
            indexOfA = cities[i].toLowerCase().indexOf('a');
            indicesOfCharA[i] = indexOfA;
        }

        System.out.println(Arrays.toString(cities));
        System.out.println(Arrays.toString(indicesOfCharA));
    }
}

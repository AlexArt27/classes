package Maps;

import java.util.*;


public class IteratingOverMapKeys {

    public static void main(String[] args) {

        Map<Integer, String> cityCodes = new HashMap<>();
        cityCodes.put(312, "Chicago");
        cityCodes.put(213, "LA");
        cityCodes.put(343, "LA");
        cityCodes.put(473, "NY");
        cityCodes.put(333, "Phily");

        Set<Integer> keySetOfCities = cityCodes.keySet();

        System.out.println("jeys: " + keySetOfCities);

        for (Integer i : keySetOfCities){
            System.out.println((i + " --> " + cityCodes.get(i)));
        }

    }
}

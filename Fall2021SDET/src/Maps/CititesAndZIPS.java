package Maps;

import java.util.HashMap;
import java.util.Map;

public class CititesAndZIPS {

    public static void main(String[] args) {

        Map<Integer, String> citiesAndZips = new HashMap<>();

        citiesAndZips.put(60489, "Chic");
        citiesAndZips.put(60189, "Chic");
        citiesAndZips.put(62183, "LA");
        citiesAndZips.put(87493, "Zhyt");
        citiesAndZips.put(76549, "Mos");

        System.out.println(citiesAndZips);

        citiesAndZips.remove(62183);

        System.out.println(citiesAndZips);

        citiesAndZips.replace(87493, "Zhyt", "Kiev");

        System.out.println(citiesAndZips);

    }
}

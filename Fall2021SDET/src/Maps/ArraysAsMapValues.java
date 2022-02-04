package Maps;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ArraysAsMapValues {

    public static void main(String[] args) {

        // created an object of Map that stores String as a key and String[] array as a value
        Map<String, String[]> majorCitiesOfContinentsMap = new HashMap<>();

        String[] euCities = {"London", "Paris", "Barcelona", "Rome"};
        String[] northAmericanCities = {"Chicago", "Toronto", "Vancouver", "Los Angeles"};
        String[] asianCities = {"Bangkok", "Singapore", "Delhi", "Tokyo", "Hong Kong", "Beijing"};

        majorCitiesOfContinentsMap.put("EU", euCities);
        majorCitiesOfContinentsMap.put("North America", northAmericanCities);
        majorCitiesOfContinentsMap.put("Asia", asianCities);

        printMajorCities(majorCitiesOfContinentsMap);

    }

    public static void printMajorCities (Map<String, String[]> mapOfMajorCities) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the continent for the major cities: ");

        String continent = scan.nextLine().toLowerCase();
        String majorCitiesText = "These are the major cities in " + continent + ": ";

        switch (continent) {
            case "eu", "europe", "european":
                System.out.println(majorCitiesText + Arrays.toString(mapOfMajorCities.get("EU")));
                break;
            case "na", "northamerica", "america", "north america":
                System.out.println(majorCitiesText + Arrays.toString(mapOfMajorCities.get("North America")));
                break;
            case "asia", "asian":
                System.out.println(majorCitiesText + Arrays.toString(mapOfMajorCities.get("Asia")));
                break;
            default:
                System.out.println("We only have the major cities for EU, NA, Asia.");
        }

    }
}
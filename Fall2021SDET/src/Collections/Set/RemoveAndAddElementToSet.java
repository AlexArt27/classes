package Collections.Set;

import java.util.*;

public class RemoveAndAddElementToSet {

    public static void main(String[] args) {
        ArrayList<String> listOfCities = new ArrayList<>(Arrays.asList("Chicago","LA","SF","NY","Boston","Dallas"));

        System.out.println("Cities in list: " + listOfCities);

        Set<String> linkedSetOfCities = new LinkedHashSet<>(listOfCities);

        System.out.println("Cities in linked: " + linkedSetOfCities);

        Set<String> hasSetOfCities = new HashSet<>(listOfCities);

        System.out.println("Cities in HashSet: " + hasSetOfCities);

        Set<String> treeSetOfCities = new TreeSet<>(hasSetOfCities);

        System.out.println("Treeset; " + treeSetOfCities);

        List<Integer> nums = List.of(10,99,67,44,55,78);
        System.out.println("GIVEN NUMBER; " + nums);
        Set<Integer> setNums = new TreeSet<>(nums);
        System.out.println("Treeset: " + setNums);


    }
}

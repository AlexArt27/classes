package Collections.Set;

import java.util.HashSet;
import java.util.Set;

public class SetCollectionIntro {

    /*
    * Set is an interface that extends collection interface
    * Set has three implementation: HashSet, LinkedHashSet, TreeSet
    * Collection that stores only unique elements without duplicates
    * Elements are unordered and not index based
    *
    *
    *
    * */

    public static void main(String[] args) {
        Set<String> carMakers = new HashSet<>();

        boolean isAdded = carMakers.add("Honda");
        boolean hasHonda = carMakers.add("Honda");

        System.out.println("Honda added? " + isAdded);
        System.out.println("Again? " + hasHonda);

        carMakers.add("Honda");
        carMakers.add("Honda");
        carMakers.add("Ford");
        carMakers.add("Cadillac");
        carMakers.add("Chevy");

        System.out.println(carMakers);

    }
}

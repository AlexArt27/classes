package Maps;

import java.util.*;

public class CollectionOfValues {

    public static void main(String[] args) {

        Map<String, Integer> carYears = new HashMap<>();

        carYears.put("Camaro", 1988);
        carYears.put("Camaro2", 3213);
        carYears.put("Camaro3", 3234);
        carYears.put("Camaro4", 33343);
        carYears.put("Camaro5", 5656);
        carYears.put("Camaro6", 3444);

        Collection<Integer> yearsBuilt = carYears.values();

        System.out.println(yearsBuilt);

        Set<String> cars = carYears.keySet();
        System.out.println(cars);


    }
}

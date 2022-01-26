package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListsMethod {
    public static void main(String[] args) {

        List<String> teslaModels = new ArrayList<>(Arrays.asList("Model 3", "Model X", "Model S", "Model Y"));

        System.out.println("TEsla cars: " + teslaModels);

        boolean hasModelS = teslaModels.contains("Model S");

        System.out.println(hasModelS? "yes" : "no");

        teslaModels.clear();

        System.out.println(teslaModels.isEmpty());

        List<String> fordCars1 = new ArrayList<>(Arrays.asList("F150","Raptor","Escape","Fusion"));
        List<String> fordCars2 = new ArrayList<>(Arrays.asList("F150","Raptor","Escape","Fusion"));

        System.out.println(fordCars1.equals(fordCars2));

        boolean isRaptorRemoved = fordCars1.remove("Raptor");
        boolean isFiestaRemoved = fordCars1.remove("Fiesta");

        System.out.println(isRaptorRemoved);
        System.out.println(isFiestaRemoved);
    }
}

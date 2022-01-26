package Maps;

import java.util.HashMap;
import java.util.Map;

public class IsleInStore {
    public static void main(String[] args) {

        Map<Byte, String> isleMAp = new HashMap<>();

        isleMAp.put((byte) 1, "Pharmacy");
        isleMAp.put((byte) 2, "Pharmacy");
        isleMAp.put((byte) 3, "Fruit");
        isleMAp.put((byte) 4, "Vege");
        isleMAp.put((byte) 5, "Home goods");
        isleMAp.put((byte) 6, "Electr");
        isleMAp.put((byte) 7, "BAckery");
        isleMAp.put((byte) 8, "Kids");

        System.out.println(isleMAp);

        System.out.println("the ; " + isleMAp.get((byte) 5));

        boolean hasKeyFour = isleMAp.containsKey((byte)8);

        System.out.println(hasKeyFour);



    }
}

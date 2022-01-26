package Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class AirportMap {

    public static void main(String[] args) {

        Map<String, String> airportCodes = new HashMap<>();

        airportCodes.put("ORD", "Chicago Int Ohare Airport");
        airportCodes.put("JFK", "John F Kennedy");
        airportCodes.put("ATL", "Jackson Hartsfield");

//        Set<Map.Entry<String, String>> airportEntries = airportCodes.entrySet();
//
//        System.out.println(airportEntries);

        for (Map.Entry<String, String> entry : airportCodes.entrySet()){
            System.out.println(entry.getValue());
            System.out.println(entry.getKey());
        }
    }
}

package Maps;

import java.text.NumberFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapSetIteration {

    public static void main(String[] args) {

        Map<String, Integer> populationMap = new HashMap<>();

        populationMap.put("Indon", 723_823_829);
        populationMap.put("Mexico", 123_823_829);
        populationMap.put("Japan", 126_823_829);
        populationMap.put("Egypt", 102_823_829);
        populationMap.put("Tanzania", 59_823_829);

        NumberFormat formatPopul = NumberFormat.getInstance();

        Set<Map.Entry<String, Integer>> entries = populationMap.entrySet();

        System.out.println(entries);

        for(Map.Entry<String, Integer> entry : entries){
            System.out.println(entry.getKey() + " has population: " + formatPopul.format(entry.getValue()));
        }

    }
}

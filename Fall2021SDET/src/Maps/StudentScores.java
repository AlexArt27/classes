package Maps;

import java.util.*;

public class StudentScores {

    public static void main(String[] args) {

        Map<String, Double> scoresMap = new HashMap<>();

        scoresMap.put("Elon", 67.5);
        scoresMap.put("Sw", 78.3);
        scoresMap.put("Ds", 90.0);
        scoresMap.put("Eloffn", 47.5);

        Set<String> scoreKeys = scoresMap.keySet();

        System.out.println(scoreKeys);


        for (String key : scoreKeys){
            System.out.println(key);
        }
    }
}

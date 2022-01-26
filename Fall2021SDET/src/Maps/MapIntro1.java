package Maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

//map is an interface that''s part of java collections framewor
//map stores Objects in keys, value pair aka entry
//map interface has 3 implementations:
/*
* - Hasmap<K,V> -> without any orders of the keys allwos one null key
* - LinkedHashMAp<K,V> -> orders elements in inserted order of the entries, allows on null key
* treemap - orders its elems in natural order, doesnt allow null key*/

public class MapIntro1 {
    public static void main(String[] args) {
        String ssnAlex = "782-23-2345";
        String nameAlex = "Alex Art";
        ArrayList<String> infoAlex = new ArrayList<>();
        infoAlex.add(ssnAlex);
        infoAlex.add(nameAlex);

        int indexOfSSN = infoAlex.indexOf("782-23-2345");
        System.out.println("some; " + infoAlex.get(indexOfSSN+1) + indexOfSSN);

        Map<String, String> map = new HashMap<String, String>();

        map.put("012-12-1221", "Alex APTAMOH");

        String name = map.get("012-12-1221");
        System.out.println("key is " + name);
    }
}

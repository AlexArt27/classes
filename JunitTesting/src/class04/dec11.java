package class04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class dec11 {

    /*
    /Array - .length;
    List - we can store collection of data of similar type. .size();
    List <>
    ArrayLIst,LinkedList,Vector
    Set

     */
    public static void main(String[] args) {

        Integer a= new Integer(12);

        int b = a; // auto inboxing

        Integer c = b;

        ArrayList<Integer> listOfData = new ArrayList<Integer>();

        listOfData.add(10);
        listOfData.add(22);
        listOfData.add(72);
        listOfData.add(45);

        listOfData.remove(new Integer(22));
        listOfData.remove(2);

        for(int data : listOfData){
            System.out.println(data);
        }

        HashSet<Integer> setOfData = new HashSet<Integer>();

        setOfData.add(19);
        setOfData.add(22);
        setOfData.add(33);
        setOfData.add(19);

        for (int data : setOfData){
            System.out.println(data);
        }

        HashMap<Integer, String> mp = new HashMap<Integer, String>();

        mp.put(2,"two");
        mp.put(1,"one");
        mp.put(5,"five");

        for (int i : mp){
            System.out.println(i);
        }

    }
}

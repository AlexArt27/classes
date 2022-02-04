package Collections;

import java.util.ArrayList;

public class ArraysListOfObj {

    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        list.add(123);
        list.add("123");
        list.add('k');
        list.add(Boolean.TRUE);

        int a = (int) list.get(0);

        System.out.println(a);

    }
}

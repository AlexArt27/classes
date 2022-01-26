package Collections.Set;

import java.util.*;

public class ArrayListToSet {

    public static void main(String[] args) {

        Short[] nums1 = {12,23,12,45,23,67,89,45,3,5,7};
        Short[] nums2 = {12,23,12,45,23,67,89,45,3,5,7,99};

        Set<Short> setAge = new HashSet<>();

        boolean isAdded1 = setAge.addAll(Arrays.asList(nums1));
        boolean isAdded2 = setAge.addAll(Arrays.asList(nums2));

        System.out.println(isAdded1);
        System.out.println(isAdded2);
        System.out.println(setAge);

        ArrayList<String> names = new ArrayList<>(Arrays.asList("Name1","Name2","Name3","Name4","Name4","Name5","Name6","Name7","Name3","Name2"));

        System.out.println(names);

        Set<String> nameSet = new HashSet<>(names);
        System.out.println(nameSet);


    }
}

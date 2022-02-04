package DummyCode;

import java.util.Arrays;

public class Arrayz {

    /*
    Arrays are fixed
    Same time to access any element
    Arrays are objets themselves
    Arrays can be primitives and non-primitives, can store arrays and other collections

    ************************************SYNTAX!!!*****************************************
    SATATYOE[] NAME = new DATATYPE[size]
     */

    public static void main(String[] args) {
        String[] names = new String[5];

        names[0] = "alex";
        names[1] = "lesia";
        names[3] = "sasha";
        names[4] = "milan";

        System.out.println(Arrays.toString(names));
        System.out.println(names[3]);

    }
}

package Collections;

public class WrapperClasses {
/*wrapper classes are classes that wrap a primitive types to Objets
* each primitive type has a corresponding wrapper class
* since arraylist is part of collection framework it is designed to work with wrapper classes to store types
*
*
* */

    public static void main(String[] args){
        String stringNumber = "2021";

        System.out.println(stringNumber + 5);

        short shortPrim = Short.parseShort(stringNumber);

        System.out.println(shortPrim+5);

        short added = (short) (shortPrim + 5);

//        ============================================

        String yearBuilt = "1977";

        System.out.println(yearBuilt + 1);

        int intValueYear = Integer.parseInt(yearBuilt);

        System.out.println(intValueYear + 1);

//        integer object value of string

        Integer i = Integer.valueOf(yearBuilt);

//        ============================================

        char c = 'a';

        Character objC = Character.valueOf(c); // converted primitive type c to object of character

        char numC = '8';

//        int primitiveIntC = Character.valueOf(numC);

        int primitiveIntC = Integer.parseInt(Character.toString(numC));

        int primInt = Character.getNumericValue(numC);

        System.out.println(primitiveIntC);

        System.out.println(primInt);
    }

}

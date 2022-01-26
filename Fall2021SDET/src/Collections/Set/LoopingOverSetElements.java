package Collections.Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class LoopingOverSetElements {
    public static void main(String[] args) {
        Set<Character> symbols = new HashSet<>(Arrays.asList('#','&','%','*','?'));

        System.out.println(symbols);

        for (char c: symbols) {
            System.out.print(c + " | ");
        }
        System.out.println();

        Iterator<Character> setIterator = symbols.iterator();

        while (setIterator.hasNext()){
            System.out.println(setIterator.next());
        }
    }
}

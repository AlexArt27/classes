package Collections.Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetInterfaceMethods {
    public static void main(String[] args) {
        Set<String> ssn = new HashSet<>(Arrays.asList(
                "020-33-3323",
                "020-33-3324",
                "020-33-3325",
                "020-33-3326"
        ));

        String mySSN = "020-33-3323";

        System.out.println("Contains? " + ssn.contains(mySSN));

        boolean isRemoveed = ssn.remove(mySSN);

        System.out.println("is removed " + isRemoveed);


    }
}

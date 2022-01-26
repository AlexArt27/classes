package DummyCode;

public class DummyCode4 {
    public static void main(String[] args) {
        String animal = " Zebra ";
        String animalTrimmed = animal.trim();
        String animalToUpp = animal.toUpperCase();
        String animalCharReplaced = animal.replace("Z", "J");

        String finalStr = animal.trim().toUpperCase().replace("E","A");

        System.out.println(finalStr);
    }

}

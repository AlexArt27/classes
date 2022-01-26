package DummyCode;

public class WhileStrings {
    public static void main(String[] args) {
        printChars("Devx");
    }

    static void printChars(String str){
        int i = str.length()-1;

        while (i >= 0) {
            System.out.print(str.charAt(i) + " ");
            i--;
        }
    }
}

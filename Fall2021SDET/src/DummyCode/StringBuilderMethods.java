package DummyCode;

public class StringBuilderMethods {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java");

        String str = sb.substring(sb.indexOf("J"),sb.indexOf("v"));

        System.out.println("String str " + str);
        System.out.println("Sb " + sb);

        sb.substring(1,3);
        System.out.println(sb);
    }
}

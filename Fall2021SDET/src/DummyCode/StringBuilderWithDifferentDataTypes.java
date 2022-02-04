package DummyCode;

public class StringBuilderWithDifferentDataTypes {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Devx");
//        sb.insert();
        sb.insert(sb.length(), " School");
        System.out.println(sb);

        sb.insert(sb.indexOf(" "), " IT");
        System.out.println(sb);
    }
}

package DummyCode;

public class SBDeleteMethod {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        sb.append("Devx");

        sb.delete(1, 3);
        System.out.println(sb);

        StringBuilder school = new StringBuilder("Stanfoed");

        String s = school.substring(school.indexOf("f"));

        StringBuilder schoolDeleted = school.delete(school.indexOf("f"), school.length());

        System.out.println(schoolDeleted);

        System.out.println(school);


    }
}

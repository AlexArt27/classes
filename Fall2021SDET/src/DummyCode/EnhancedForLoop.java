package DummyCode;

public class EnhancedForLoop {

    public static void main(String[] args) {
        String[] names = new String[]{"alex", "sasha", "lesia", "serhii"};

        for (String name : names){
            if (name.startsWith("l")) System.out.println(name);
        }

        char[] charArr = {'a', 'b', 'f', 'd', 'r'};

        for (char charElement : charArr){
            System.out.println(charElement);
        }
    }
}

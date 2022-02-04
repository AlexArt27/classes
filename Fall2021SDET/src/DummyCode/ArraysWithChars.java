package DummyCode;

import java.util.Arrays;

public class ArraysWithChars {
    public static void main(String[] args) {
        char[][] symbols = new char[4][2];

        symbols[0][0] = '!';
        symbols[0][1] = '@';

        symbols[1][0] = '#';
        symbols[1][1] = '$';

        symbols[2][0] = '%';
        symbols[2][1] = '^';

        symbols[3][0] = '&';
        symbols[3][1] = '*';

        for (char[] chars : symbols){
            System.out.println(Arrays.toString(chars));
        }
    }
}

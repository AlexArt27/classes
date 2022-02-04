package experiment;

public class Calculator {
    static int zero;
    static int one;
    static int two;
    static int three;
    static int four;
    static int five;
    static int six;
    static int seven;
    static int eight;
    static int nine;
    static String calcName;

    public static void main(String[] args){
        zero = 0;
        one = 1;
        two = 2;
        three = 3;
        four = 4;
        five = 5;
        six = 6;
        seven = 7;
        eight = 8;
        nine = 9;
        multiply(two,three);
    }
    public static void multiply(int first, int second){
        System.out.println(first*second);
    }
}

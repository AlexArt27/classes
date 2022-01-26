package javabots;

public class SecondClass {

    static void print(int whatToPrint){
        System.out.println(whatToPrint);
    }

    static void print(String whatToPrint) {
        System.out.println(whatToPrint);
    }

    static int multiply(int firstNumber, int secondNumber){
        System.out.println(firstNumber*secondNumber);
        return firstNumber*secondNumber;
    }

    public static void main(String[] args) {
        print(multiply(3,4));
        print("Something");
    }
}

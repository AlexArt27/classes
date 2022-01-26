package DummyCode;

import java.util.Scanner;

public class CarDataMethodsClass {

    public static void main(String[] args) {
        System.out.println("Car info");
        takeInput();
    }
    public static void takeInput(){
        Scanner input = new Scanner(System.in);
        System.out.println("Year: ");
        int year = input.nextInt();

        input.nextLine();

        System.out.println("Make: ");
        String make = input.nextLine();

        System.out.println("Model: ");
        String model = input.nextLine();

        System.out.println("Color: ");
        String color = input.nextLine();

        System.out.println("Engine: ");
        double engine = input.nextDouble();

        new CarDataMethodsClass().printLabel(year,make,model,color,engine);
    }

    public void printLabel(int carYear,String carMake, String carModel, String carColor, double carEng){
        System.out.println(carYear);
        System.out.println(carMake.toUpperCase());
        System.out.println(carModel.toUpperCase());
        System.out.println(carColor.substring(0, 1).toUpperCase() + carColor.substring(1));
        System.out.println(carEng);
    }

}

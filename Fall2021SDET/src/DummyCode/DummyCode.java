package DummyCode;

import java.util.Scanner;

public class DummyCode {
    public static void main(String[] args) {
        String nameShape = " ";
        String typeShape = " ";
        double perimeter = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("How many sides?");
        byte numOfSides = input.nextByte();
        if(numOfSides == 3){
            typeShape = "Triangle";
            System.out.println("a");
            double a = input.nextDouble();
            System.out.println("b");
            double b = input.nextDouble();
            System.out.println("c");
            double c = input.nextDouble();
            if((a == b) && (a == c)){
                nameShape = "Equilateral";
                perimeter = a * 3;
            }else if(a == b || a == c || b == c){
                nameShape = "Isosceles";
                perimeter = a + b + c;
            }else{
                nameShape = "Scalene";
                perimeter = a + b + c;
            }
            System.out.println(nameShape +" " + typeShape + "" + perimeter);
        }
        if(numOfSides == 4){
            typeShape = "Quadrilateral";
            System.out.println("a");
            double a = input.nextDouble();
            System.out.println("b");
            double b = input.nextDouble();
            System.out.println("c");
            double c = input.nextDouble();
            System.out.println("d");
            double d = input.nextDouble();
            if((a == b) && (a == c) && (a == d)){
                nameShape = "Square";
                perimeter = a * 4;
            }else if(a == b && c == d || a == c && b == d || a == d && c == b){
                nameShape = "Rectangular";
                perimeter = a + b + c + d;
            }else if(a == b || a == c || a == d || b == c || b == d || d == c){
                nameShape = " Scale Trapezoid";
                perimeter = a + b + c + d;
            }else{
                nameShape = " Irregular Trapezoid";
                perimeter = a + b + c + d;
            }
            System.out.println(nameShape +" " + typeShape + " " + perimeter);
        }
        else{
            System.out.println("Incorrect shape");
        }



    }
}
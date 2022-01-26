package DummyCode;

public class DummyCode5 {
    public static void main(String[] args) {

        int x = 7;
        int y = 2;

        System.out.println(getSum(x,y));
        System.out.println(getProduct(x,y));

        DummyCode5 obj = new DummyCode5();
        int sub = obj.getSubs(x,y);
        double div = obj.getDiv(x,y);

        System.out.println(sub);
        System.out.println(div);
    }
    public static int getSum(int a, int b){
        return a + b;
    }

    public static int getProduct(int a, int b){
        return a * b;
    }

    public int getSubs(int a, int b){
        return a - b;
    }

    public double getDiv(double a, double b){
        return a / b;
    }
}

package DummyCode;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ArraysEachLoop {
    public static void main(String[] args) {

        int[] arr = new int[5];

        arr[0] = 5;
        arr[1] = 5;
        arr[2] = 4;
        arr[3] = 5;
        arr[4] = 8;

        int sum =0;
        for (int i : arr){
            System.out.println(i);

            sum+= i;

        }
        System.out.println(sum);
    }

}

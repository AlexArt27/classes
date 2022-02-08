package DummyCode;

import java.util.Arrays;

public class DummyCode6 {
    public static void main(String[] args) {
        String str = "sdel";

//        System.out.println((str.substring(0,1)+str.substring(4,str.length())));
        System.out.println(str.substring(1,3));
//        System.out.println(str.substring(1,4).equals("del"));

        if (str.length()>=4){
        if(str.substring(1,4).equals("del")){
            System.out.println((str.substring(0,1)+str.substring(4,str.length())));
        }else{
            System.out.println(str);
        }
        }
        System.out.println(str);
    }
}

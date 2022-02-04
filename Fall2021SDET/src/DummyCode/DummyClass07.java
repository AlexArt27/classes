package DummyCode;

public class DummyClass07 {
    public static void main(String[] args) {
        String str = "A5l2e3x4";
        int num = 0;
        new DummyClass07().sum(str,num);
    }
        public void sum(String str, int num){
            for(int i = 0;i<=str.length()-1;i++){
                if(str.charAt(i) <= 57 && str.charAt(i) >= 49){
//                    num += str.charAt(i);
                    num += Integer.valueOf(String.valueOf(str.charAt(i)));
                }

            }
            System.out.println(num);
        }
    }


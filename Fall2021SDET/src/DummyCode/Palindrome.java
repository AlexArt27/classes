package DummyCode;

public class Palindrome {

    public static void main(String[] args) throws InterruptedException{
//        String str = "meadaem";
//
//        int right = str.length()-1;
//        int left = 0;
//        boolean isPalindrome = true;
//        while (left<right){
//            if(str.charAt(right) != str.charAt(left)){
//                isPalindrome = false;
//                break;
//            }
//            right--;
//            left++;
//        }
//        System.out.println(isPalindrome);


//        String str = "SSSSSMEEEEE";
//
//        int right = str.length()-1;
//        int left = 0;
//        boolean isPalindrome = true;
//
//        while (left<right){
//            System.out.println(str.charAt(left));
//            System.out.println(str.charAt(right));
//            Thread.sleep(1000);
//            left++;
//            right--;
//        }

        int[] nums = {1,8,4,3,7,9,99};
        int lastNum = nums.length;
//        System.out.println(lastNum);
        while (lastNum>0){
            lastNum--;
            if(nums[lastNum] == 3){
                continue;
            }

            System.out.println(nums[lastNum]);
        }



    }
}

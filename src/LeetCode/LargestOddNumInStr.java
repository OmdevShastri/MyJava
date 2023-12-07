package LeetCode;

public class LargestOddNumInStr {
    public static void main(String[] args) {
        String str = "";
        System.out.println(Solution.largestOddNumber(str));
    }
    static class Solution {
        public static String largestOddNumber(String num) {
            for (int i = num.length()-1 ; i>=0; i--) {
//                char c = num.charAt(i);
////
//                if(Integer.parseInt(String.valueOf(c))%2 !=0){
//                    String sub = num.substring(0,i+1);
//                    ans.append(sub);
//                    break;
//                }
//                if(Integer.parseInt(num.substring(0,i))%2 !=0){
////                    ans.append(num.substring(0,i));
////                    break;
//                    return num.substring(0,i);
//                }
                int digit = (int) num.charAt(i);
                if(digit%2!=0)
                {
                    return num.substring(0, i+1);
                }
            }
            return "";
        }
    }
}

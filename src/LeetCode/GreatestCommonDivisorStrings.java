package LeetCode;

public class GreatestCommonDivisorStrings {
    public static void main(String[] args) {
        //String str1 = "ABCABC", str2 = "ABC";
        String str1 = "ABABAB", str2 = "ABAB";
        //String str1 = "LEET", str2 = "CODE";
        System.out.println(Solution.gcdOfStrings(str1, str2));
    }
}
class Solution {
    public static String gcdOfStrings(String str1, String str2) {
//        StringBuilder ans = new StringBuilder();
//
//        int maxLen = Math.max(str1.length(), str2.length());
//
//        for (int i = 0; i < maxLen; i++) {
//            boolean unique= true;
//            if (str1.charAt(i)==str2.charAt(i)){
//                if (!ans.isEmpty() && ans.charAt(0)==str1.charAt(i)){
//                    unique = false;
//                    break;
//                }
//                ans.append(str1.charAt(i));
//
//            }
//
//        }


//        return ans.toString();
        if (str1.length()<str2.length()){
            return gcdOfStrings(str2,str1);
        }
        else if (!str1.startsWith(str2)){
            return "";
        } else if (str2.isEmpty()) {
            return str1;
        }
        else {
            return gcdOfStrings(str1.substring(str2.length()),str2);
        }


    }
}

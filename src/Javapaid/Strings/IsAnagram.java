package Javapaid.Strings;

import java.util.Arrays;

public class IsAnagram {
    public static boolean anagram(String str, String str1){
        boolean result = false;
        //first check if strings are of same length
        if (str.length() == str1.length()) {
            //convert to char array
            char[] strCharArray = str.toCharArray();
            char[] str1CharArray = str1.toCharArray();
            //sort the arrays
            Arrays.sort(strCharArray);
            Arrays.sort(str1CharArray);
            //if  the sorted arrays are equal then the strings can be said that they are anagrams of each other
            result = Arrays.equals(strCharArray, str1CharArray);
        }
//        for (int i = 0; i < str.length(); i++) {
//            boolean contains = false;
//            for (int j = 0; j < str1.length(); j++) {
//                if (str.charAt(i)==str1.charAt(j))
//                    contains = true;
//            }
//            if (contains) {
//                continue;
//            }
//        }
        return result;
    }
    public static void main(String[] args) {
        String str = new String("race");
        String str1 = new String("care");

        System.out.println(anagram(str, str1));
    }
}

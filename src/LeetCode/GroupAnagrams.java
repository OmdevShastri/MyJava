package LeetCode;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    public static void main(String[] args) {

    }
//    class Solution {
//        public List<List<String>> groupAnagrams(String[] strs) {
//            List<List<String>> ans = new ArrayList<>();
//            List<String> stage = new ArrayList<>();
//            if (strs.length == 1) {
//                stage.add(strs[0]);
//                ans.add(stage);
//                return ans;
//            } else if (strs.length < 1) {
//                return ans;
//            }
//
//            for (String str :
//                    strs) {
//
//            }
//
//
//        }
//
//        static boolean isAnagram(String str1, String str2) {
////            String s1 = str1.replaceAll("\\s", "");
////            String s2 = str2.replaceAll("\\s", "");
//            //boolean status = true;
//            if (str1.length() != str2.length()) {
//                return false;
//            } else {
//                char[] ArrayS1 = str1.toCharArray();
//                char[] ArrayS2 = str2.toCharArray();
//                Arrays.sort(ArrayS1);
//                Arrays.sort(ArrayS2);
//                return Arrays.equals(ArrayS1, ArrayS2);
//            }
//        }
//    }
    class Solution {
        public List<List<String>> groupAnagrams(String[] strs) {
            HashMap<String,List<String>> map = new HashMap<>();

            for (String str: strs
                 ) {
                char [] chars = str.toCharArray();
                Arrays.sort(chars);
                String sorted = new String(chars);

                if (!map.containsKey(sorted)){
                    map.put(sorted,new ArrayList<>());
                }
                map.get(sorted).add(str);
            }
            return new ArrayList<>(map.values());
        }
    }
}

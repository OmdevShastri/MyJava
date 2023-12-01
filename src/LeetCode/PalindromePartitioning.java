package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PalindromePartitioning {
    public static void main(String[] args) {
        String str= "aab";
        List<List<String>> ans = Solution.partition(str);

        for(List<String> innerLs : ans) {
            String[] arr = innerLs.toArray(new String[0]);
            System.out.println(Arrays.deepToString(arr));
        }
    }
    static class Solution {
        public static List<List<String>> partition(String s) {
            List<List<String>> ans = new ArrayList<>();
            if (s.equals("")){
                ans.add(new ArrayList<>());
                return ans;
            }

            for (int i = 0; i < s.length(); i++) {
                if (isPalin(s,i+1)){
                    for (List<String> list:
                    partition(s.substring(i+1))){
                        list.add(0, s.substring(0, i+1));
                        ans.add(list);
                    }
                }
            }
            return ans;
        }

        private static boolean isPalin(String s, int n) {
            for (int i = 0; i < n/2; i++) {
                if (s.charAt(i)!=s.charAt(n-i-1)){
                    return false;
                }
            }
            return true;
        }

    }
}

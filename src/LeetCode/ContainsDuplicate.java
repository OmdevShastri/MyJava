package LeetCode;

import java.util.HashMap;
import java.util.HashSet;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int [] nums = {1,2,3,1};
        System.out.println(Solution.containsDuplicate(nums));
    }
    static class Solution{
        public static boolean containsDuplicate(int[] nums){
            HashSet<Integer> map = new HashSet<>();
            for (int i = 0; i < nums.length; i++) {
                if (map.contains(nums[i])){
                    return true;
                }
                map.add(nums[i]);
            }
            return false;
        }

    }
}

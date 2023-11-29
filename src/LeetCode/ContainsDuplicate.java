package LeetCode;

import java.util.HashSet;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int [] nums = {1,2,3,1};
        System.out.println(Solution.containsDuplicate(nums));
    }
    static class Solution{
        public static boolean containsDuplicate(int[] nums){
            HashSet<Integer> map = new HashSet<>();
            for (int num : nums) {
                if (map.contains(num)) {
                    return true;
                }
                map.add(num);
            }
            return false;
        }

    }
}

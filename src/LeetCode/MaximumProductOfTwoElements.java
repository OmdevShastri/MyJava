package LeetCode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class MaximumProductOfTwoElements {
    public static void main(String[] args) {

    }
    class Solution {
//        public int maxProduct(int[] nums) {
//            if (nums.length==1){
//                return nums[0];
//            } else if (nums.length==0) {
//                return 0;
//            }
//            Queue<Integer> q = new PriorityQueue<>(Comparator.reverseOrder());
//            for (int i :
//                    nums) {
//                q.add(i);
//            }
//            return (q.poll()-1)*(q.poll()-1);
//        }
        public int maxProduct(int[] nums) {
            Arrays.sort(nums);
            return (nums[nums.length-1]-1)*(nums[nums.length-2]-1);
        }
    }
}

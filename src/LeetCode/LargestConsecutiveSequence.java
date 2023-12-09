package LeetCode;

import java.util.HashSet;

public class LargestConsecutiveSequence {
    public static void main(String[] args) {
        int [] arr ={100,4,200,1,3,2};
        int [] arr1 ={0,3,7,2,5,8,4,6,0,1};
        System.out.println(Solution.longestConsecutive(arr1));
    }
    static class Solution {
        public static int longestConsecutive(int[] nums) {
//            if (nums.length==1){
//                return 0;
//            }
//            Arrays.sort(nums);
//            System.out.println(Arrays.toString(nums));
//            int [] lenA =new int[nums.length];
//            int len =1;
//            int res=0;
//
//            for (int i = 0; i < nums.length-1; i++) {
//                if (nums[i+1]==(nums[i]+1)){
//                    len++;
//                } else {
//                    res=Math.max(len,res);
//                    len=1;
//                }
//            }
//            return res;
            if (nums.length == 0) return 0;
            HashSet<Integer> hs = new HashSet<>();
            for(int num:nums) hs.add(num);
            int longest =1;
            for(int num: nums ){
                //check if the num is the start of a sequence by checking if left exists
                if(!hs.contains(num-1)){ // start of a sequence
                    int count =1;
                    while(hs.contains(num + 1)){ // check if hs contains next no.
                        num++;
                        count++;
                    }
                    longest = Math.max(longest, count);

                }
                if(longest > nums.length/2) break;

            }
            System.gc();
            return longest;

        }
    }
}

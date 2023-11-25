package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class SumOfAbsDifferencesInSortedArr {

    //HashMap<Integer, Integer> map = new HashMap<>();

    public static int[] getSumAbsoluteDifferences(int[] nums) {
//        int n = nums.length;
//        int sub = 0;
//        int sum = 0;
//
//        List<Integer> ans = new ArrayList<Integer>();
//
//        // Keep track of the accumulated of the sum of values to right
//        for (int i = n - 1; i >= 0; i--)
//            sum += nums[i];
//
//        // Keep track of the accumulated subtraction of the values to the left
//        for (int i = 0; i < nums.length; i++) {
//
//            sum -= nums[i];
//            // Add the value to the resultant
//            // array ans[]
//            ans.add(sub + (i * nums[i])- ((n - i - 1)* nums[i])+ sum);
//
//            sub -= nums[i];
//        }
//        return ans.stream().mapToInt(i -> i).toArray();
        int sum =0;
        for (int n :
                nums) {
            sum+=n;
        }
        int left =0;
        int right=sum;

        int [] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            right-= n;
            result[i] = n * i - left + right - n * (nums.length - i - 1);
            left+=n;
        }
        return result;
    }

    public static void main(String[] args) {
        int [] nums = new int[]{2,3,5};
        System.out.println(Arrays.toString(getSumAbsoluteDifferences(nums)));
    }
}

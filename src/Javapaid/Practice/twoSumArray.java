package Javapaid.Practice;
import java.util.*;

class twoSumArray {
    public static int[] twoSum(int[] nums, int target) {
        int [] ans = new int [2];
        int sum = 0;
        for(int i = 0 ; i<nums.length-1 ; i++){
            for(int j = 1; j<nums.length; j++){
                if (i == j){
                    continue;
                }
                sum = nums[i]+nums[j];
                if(sum == target){
                    ans[0]=i;
                    ans[1]=j;
                    return ans;
                }
            }
        }
        return ans;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] nums = new int [n];

        for(int i =0; i<n ; i++){
            nums[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int [] ans = twoSum(nums, target);

        System.out.print("( " + ans[0] + ", " + ans[1] + " )");
    }
}
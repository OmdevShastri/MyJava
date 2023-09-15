package Javapaid.DivideAndConcoer;

import java.util.HashMap;

public class MajorityElementArr {

    public static int majorDumb(int [] arr){
        //return the first if not enough elements to check major
        if (arr.length == 1 || arr.length == 2) {
            return arr[0];
        }

        int majorityC = arr.length/2;
        int ans=-111;
        int [] count =new int[100];

        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }


        //check for largest pos
        for (int i = 0; i < count.length; i++) {
            if (count[i] >=majorityC) {
                ans =i;
            }
            else {
                continue;
            }

        }

        return ans;
    }


    public static int major(int[] nums, int lo, int hi) {

        // base case; the only element in an array of size 1 is the majority element.
        if (lo == hi) {
            return nums[lo];
            }

        // recurse on left and right halves of this slice.
        int mid = (hi-lo)/2 + lo;
        int left = major(nums, lo, mid);
        int right = major(nums, mid+1, hi);
        // if the two halves agree on the majority element, return it.
        if (left == right) {
            return left;
        }
        // otherwise, count each element and return the "winner".
        int leftCount = countInRange(nums, left, lo, hi);
        int rightCount = countInRange(nums, right, lo, hi);
        return leftCount > rightCount ? left : right;
    }

    private static int countInRange(int[] nums, int num, int lo, int hi) {
        int count = 0;
        for (int i = lo; i <= hi; i++) {
            if (nums[i] == num) {
                count++;
            }
        }
        return count;
    }

    private static int majorityElement(int[] nums) {
        return major(nums, 0, nums.length-1);
    }

    //main
    public static void main(String[] args) {
        int [] arr = {3,2,3};
        System.out.println(majorDumb(arr));
        System.out.println(majorityElement(arr));
    }
}

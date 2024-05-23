package EverythingForAccenture;

import java.util.Arrays;

public class CountAbsDiff {

    public static int findCount(int arr[], int num, int diff){
        int count=0;
        if (arr == null)
            return -1;

        Arrays.sort(arr);
        int low = num-diff;
        int high = num+diff;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>=low && arr[i]<=high){
                count++;
            } else if (arr[i]>high) {
                break;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int [] arr = {12, 3, 14, 56, 77, 13, 14, 11, 15, 10};
        int num= 13;
        int diff = 3;

        System.out.println(findCount(arr, num, diff));
    }
}

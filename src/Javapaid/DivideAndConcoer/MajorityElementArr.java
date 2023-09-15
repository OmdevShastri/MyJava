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
    public static void main(String[] args) {
        int [] arr = {3,2,3};
        System.out.println(majorDumb(arr));
        System.out.println(major(arr));
    }

    public static int major(int[] arr) {
        //return the first if not enough elements to check major
        if (arr.length == 1 || arr.length == 2) {
            return arr[0];
        }

        int majorityC = arr.length/2;

    }
}

package Javapaid.Recursion;

import java.util.Scanner;

public class IsSorted {
    public static void main(String[] args) {
        System.out.println("Array ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(sorted(arr,0));
    }

    private static boolean sorted(int [] arr, int i) {
        //int i =0;
        if (i == arr.length-1) {
            return true;
        }
        if (arr[i] > arr[i+1]) {
            return false;
        }

        return sorted(arr,i+1);
    }
}

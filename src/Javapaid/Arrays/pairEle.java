package Javapaid.Arrays;

import java.util.Scanner;
//O(n^2)
public class pairEle {
    public static void pairPro(int arr[]){
        int num=0;
        for (int i = 0; i<arr.length; i++){
            int curr = arr[i];
            for (int j = i+1; j< arr.length; j++){
                System.out.print("("+curr+","+arr[j]+")");
            }
            System.out.println();
        }
    }
    public static void main(String [] args){
        int[] arr = {1,2,3,4,5,6,7,8,9,0};
        pairPro(arr);

    }
}

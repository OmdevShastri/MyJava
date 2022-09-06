package Javapaid.Arrays;

import java.util.Scanner;

public class arrOne {
    public static int linearSearch(int[] arr, int num){
        for (int i=0; i<arr.length;i++){
            if (arr[i]==num){
                return i;
            }
        }
        return -1;
    }
    public static int binarySearch(int[] arr, int key){
        int st=0;
        int en= arr.length-1;


        while(st<=en){
            int mid=(st+en)/2;

            if (arr[mid] == key){
                return mid;
            }
            else if (arr[mid]<key){
                st = mid+1;
            }else {
                en=mid-1;
            }
        }
        return -1;
    }

    public static void main(String [ ] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i=0; i<n;i++){
            System.out.println("Enter number");
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter a key");
        int key = sc.nextInt();

        int index = binarySearch(arr,key);
        System.out.println("The number is at: "+ index) ;


    }
}

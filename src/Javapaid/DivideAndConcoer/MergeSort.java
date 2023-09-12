package Javapaid.DivideAndConcoer;

import java.util.Scanner;

public class MergeSort {

    public static void prtArr(int [] Arr){
        for (int i=0; i< Arr.length; i++) {
            System.out.print(Arr[i]+" ");
        }
        System.out.println();
    }

    public static void mSort(int [] arr, int si, int ei){
        //base
        if (si >= ei) {
            return;
        }
        //work
        int mid = si+((ei-si)/2);
        mSort(arr, si, mid); // left
        mSort(arr, mid+1, ei ); //right
        merger(arr, si, mid, ei);
    }

    public static void merger(int[] arr, int si, int mid, int ei) {
        int [] temp = new int[(ei-si)+1];
        int i = si; //iterator for left part
        int j = mid+1; // iterator for right part
        int k = 0; //iterator for temp arr

        while (i<=mid && j <=ei){
            if (arr[i]< arr[j]){
                temp[k] = arr[i];
                i++;
            }else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        //remaining elements in left
        while (i<=mid){
            temp[k++] = arr[i++];
        }
        //remaining elements in right
        while (j<=ei){
            temp[k++] = arr[j++];
        }
        //copy temp to original arr
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i=0; i<n; i++ ) {
            arr[i] = sc.nextInt();
        }

        mSort(arr, 0,n-1);
        prtArr(arr);
    }
}

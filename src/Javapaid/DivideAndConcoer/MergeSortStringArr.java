package Javapaid.DivideAndConcoer;

import java.util.Scanner;

public class MergeSortStringArr { //O(nlog(n) // O(n) // depth first // changes required

    public static void prtArr(String [] Arr){
        for (int i=0; i< Arr.length; i++) {
            System.out.print(Arr[i]+" ");
        }
        System.out.println();
    }

    public static void mSortStr(String [] arr, int si, int ei){
        //base
        if (si >= ei) {
            return;
        }
        //work
        int mid = si+((ei-si)/2);
        mSortStr(arr, si, mid); // left
        mSortStr(arr, mid+1, ei ); //right
        merger(arr, si, mid, ei);
    }

    public static void merger(String[] arr, int si, int mid, int ei) {
        String [] temp = new String[(ei-si)+1];
        int i = si; //iterator for left part
        int j = mid+1; // iterator for right part
        int k = 0; //iterator for temp arr

        while (i<=mid && j <=ei){

            if (arr[i].charAt(0)< arr[j].charAt(0)){
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
        String  [] arr = {"sun", "earth", "mars", "mercury"};


        mSortStr(arr, 0, arr.length-1);
        prtArr(arr);
    }
}

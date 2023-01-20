package Javapaid.Arrays;

import java.util.ArrayList;
import java.util.List;

public class MinMax {
    static class Pair{
        int max;
        int min;
    }
    static Pair getMinMax(int [] arr, int n){
        Pair minmax = new  Pair();
        if (arr.length==1){
            minmax.min = arr[0];
            minmax.max = arr[0];
            return minmax;
        }
        //initializing min and max
        if (arr[0]>arr[1]){
            minmax.max = arr[0];
            minmax.min = arr[1];
        }else {
            minmax.max = arr[1];
            minmax.min = arr[0];
        }

        for (int i = 0; i < arr.length; i++) {

            if (arr[i]< minmax.min){
                minmax.min = arr[i];
            }else if(arr[i]> minmax.max) {
                minmax.max = arr[i];
            }
        }
        return minmax;
    }
    public static void main(String[] args) {

        int [] arr = {3,5,1,7,8,10000,0,13,4};

        Pair minmax = getMinMax(arr, arr.length);

        System.out.println("min is "+ minmax.min);
        System.out.println("max is "+ minmax.max);

    }
}










package Javapaid.DivideAndConquer;

public class QuickSort {
    public static void prtArr(int [] Arr){
        for (int i=0; i< Arr.length; i++) {
            System.out.print(Arr[i]+" ");
        }
        System.out.println();
    }
    public static void sortMeQuick(int[] arr, int si, int ei) {
        //base
        if (si >= ei) {
            return;
        }
        //last element
        int pIdx = partition(arr, si, ei);

        sortMeQuick(arr, si, pIdx-1); // left
        sortMeQuick(arr, pIdx+1, ei); // right
    }

    public static int partition(int[] arr, int si, int ei) {
        int pivot = arr[ei];
        int i = si-1; //to make space for smaller elements

        for (int j = si; j < ei; j++) {
            if (arr[j]<=pivot){
                i++;

                //swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        //swap for correct pos of pivot
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }

    public static void main(String[] args) {
        int [] arr = {6,3,9,8,2,5};
        sortMeQuick(arr, 0, arr.length-1);
        prtArr(arr);
    }


}

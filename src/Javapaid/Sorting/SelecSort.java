package Javapaid.Sorting;

public class SelecSort {
    public static void selectionSort(int [] arr){
        for (int i = 0; i < arr.length-2; i++) {
            int minPos = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[minPos]>arr[j]) {
                    minPos=j;
                }
            }
            //swap
            int temp= arr[minPos];
            arr[minPos]=arr[i];
            arr[i]= temp;

        }
    }
    public static void prtArr(int [] arr){
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int [] arr = new int[]{5, 4, 1, 3, 2};
        selectionSort(arr);
        prtArr(arr);


    }
}

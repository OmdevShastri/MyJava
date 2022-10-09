package Javapaid.Sorting;

public class BubbleS {
    public static int [] bubbleSort(int [] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean flag= false;
            for (int j = 0; j < arr.length-1-i; j++) {
                //swaps++;
                if (arr[j] > arr[j + 1]) {
                    flag=true;
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            //optimised
            if (!flag){
                System.out.println("Wow wow wow stop");
                return arr;
                }
            }
        return arr;
    }
    public static int [] bubbleSortDesc(int [] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean flag= false;
            for (int j = 0; j < arr.length-1-i; j++) {
                //swaps++;
                if (arr[j] < arr[j + 1]) {
                    flag=true;
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            //optimised
            if (!flag){
                System.out.println("Wow wow wow stop");
                return arr;
            }
        }
        return arr;
    }
    public static void prtArr(int [] arr){
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int [] arr = new int[]{5,4,1,3,2};
        //bubbleSortDesc(arr);
        prtArr(bubbleSort(arr));
        prtArr(bubbleSortDesc(arr));
    }
}

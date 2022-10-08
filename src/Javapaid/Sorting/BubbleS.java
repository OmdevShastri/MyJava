package Javapaid.Sorting;

public class BubbleS {
    public static int [] bubbleSort(int [] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int swaps=0;
            for (int j = 0; j < arr.length-1-i; j++) {
                //swaps++;
                if (arr[j] > arr[j + 1]) {
                    swaps++;
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
                //optimised
                if (swaps ==0){
                    //System.out.println("Wow wow wow stop");
                    break;
                }
            }
            //optimised
            if (swaps ==0){
                System.out.println("Wow wow wow stop");
                break;
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
        bubbleSort(arr);
        prtArr(bubbleSort(arr));
    }
}

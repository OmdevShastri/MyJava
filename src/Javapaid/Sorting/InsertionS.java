package Javapaid.Sorting;

public class InsertionS {
    public static void insertSort(int [] arr){
        for (int i = 1; i <arr.length ; i++) {
            int curr= arr[i];
            int prev = i-1;
            //finding the right position
            while(prev>=0 && arr[prev]> curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            //insertion of the element
            arr[prev+1]= curr;
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
        insertSort(arr);
        prtArr(arr);
    }
}

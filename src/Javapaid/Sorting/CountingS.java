package Javapaid.Sorting;

public class CountingS {
    public static void countS(int [] arr){
        int largest = Integer.MIN_VALUE;

        //to get the size of count arr
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest,arr[i]);
        }
        //counting each value occurrence
        int [] count = new int[largest+1];
        for (int j : arr) {
            count[j]++;

        }
        //sorting
        int j=0;
        for (int i = 0; i < count.length; i++) {
            while(count[i]>0){
                arr[j] =i;
                j++;
                count[i]--;
            }
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
        countS(arr);
        prtArr(arr);
        arr = new int[]{1, 4, 1, 3, 2, 4, 3, 7};
        countS(arr);
        prtArr(arr);
    }
}

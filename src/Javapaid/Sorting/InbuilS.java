package Javapaid.Sorting;
import java.util.Arrays;

public class InbuilS {
    public static void prtArr(Integer [] arr){
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Integer [] arr = new Integer[]{5, 4, 1, 3, 2};
        Arrays.sort(arr);
        prtArr(arr);

    }
}

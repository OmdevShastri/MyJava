package Javapaid.Recursion;

import java.util.Scanner;

public class FirstLastOccurrence {

    public static void main(String[] args) {
        System.out.println("Array ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("To find?");
        int key = sc.nextInt();
        System.out.println(occ(arr,key,0));

        System.out.println("Last occurrence at ");
        System.out.println(occLast(arr,key,n-1));

    }

    private static int occ(int[] arr, int key, int i) {
        if (i >=arr.length) {
            return -1;
        }
        if (arr[i]==key){
            return i;
        }
        return occ(arr, key, i+1);
    }
    private static int occLast(int[] arr, int key, int i) {
        if (i <=0) {
            return -1;
        }
        if (arr[i]==key){
            return i;
        }
        return occLast(arr, key, i-1);
    }
}

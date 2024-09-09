package EverythingForAccenture;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class OneDArrEvenOddSum {

    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int [n];
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        //int sum = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                even.add(arr[i]);
            }else
                odd.add(arr[i]);
        }

        even.sort(Integer::compareTo);
        odd.sort(Integer::compareTo);
        System.out.println(even.get(even.size()-2)+odd.get(odd.size()-2));
    }
}

package RandomQs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListMissingNum {
    //for one missing element in unsorted array list
    public static int finfItPls(ArrayList given){
        int ans=-1;
        //to find smallest and largest number in the list
        int smallest = (int) Collections.min(given);
        int largest = (int) Collections.max(given);

        for (int i= smallest; i<largest; i++) {
            if (given.contains(i))
                continue;
            else
                ans=i;
        }

        return ans;
    }
    public static void main(String[] args) {
        ArrayList<Integer> given = new ArrayList<Integer>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter given array size");
        int n = sc.nextInt();

        //take input
        for (int i = 0; i < n; i++) {
            given.add(i, sc.nextInt());
        }

        System.out.println("Finding the missing element...");
        System.out.println(finfItPls(given));
    }
}

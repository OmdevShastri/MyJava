package Javapaid.Hashings;

import java.util.HashSet;

public class UnionAndIntersection {

    public static void main(String[] args) {
        int [] arr1 = {7,3,9};
        int [] arr2 = {6,3,9,2,9,4};

        HashSet<Integer> hs = new HashSet<>();

        //union
        for (int j : arr1) {
            hs.add(j);
        }
        for (int j : arr2) {
            hs.add(j);
        }
        System.out.println(hs.size()+ " "+ hs);

        //intersection
        hs.clear();
        for (int i = 0; i < arr1.length; i++) {
            hs.add(arr1[i]);
        }

        int count =0;
        for (int i = 0; i < arr2.length; i++) {
            if (hs.contains(arr2[i])){
                count++;
                System.out.println(arr2[i]);
                hs.remove(arr2[i]);
            }
        }
        System.out.println(count);
    }
}

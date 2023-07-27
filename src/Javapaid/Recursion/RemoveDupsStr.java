package Javapaid.Recursion;

import java.util.HashMap;

public class RemoveDupsStr {
    HashMap<Integer,Integer> mapB = new HashMap<>();

    private static void removeDups(String str, int i, StringBuilder result, boolean [] mapA){
        //base
        if (i==str.length()) {
            System.out.println(result);
            return;
        }

        //work
        char charCurr = str.charAt(i);
        if (mapA[charCurr-'a']==true) {
            removeDups(str, i+1, result, mapA);
        }else {
            mapA[charCurr-'a'] = true;
            removeDups(str, i+1, result.append(charCurr), mapA);
        }
    }

    public static void main(String[] args) {
        String str = "appnnacollege";
        removeDups(str, 0, new StringBuilder(""), new boolean[26]);
    }
}

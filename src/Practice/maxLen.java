package Practice;

import java.util.HashSet;

public class maxLen {
    public static void main(String[] args) {
        HashSet<Character> set = new HashSet<>();
        String s = "abcde";
        int count =0;
        for (char ch :
                s.toCharArray()) {
            if (set.contains(ch)){
                count--;
            }
            else {
                set.add(ch);
            }
        }
        System.out.println(set.size()-count);

    }
}

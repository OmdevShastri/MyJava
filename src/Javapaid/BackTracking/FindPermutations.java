package Javapaid.BackTracking;

public class FindPermutations {
    public static void main(String[] args) {
        String str = "abc";
        findPerm(str, "");

    }

    private static void findPerm(String str, String ans) { // O(n*n!)
        //base
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }
        //recursion
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            //"abcde" => "ab" + "de" = "abde"
            String Newstr = str.substring(0,i)+str.substring(i+1);
            findPerm(Newstr, ans+curr);
        }
    }
}

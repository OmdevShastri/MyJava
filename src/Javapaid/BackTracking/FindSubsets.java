package Javapaid.BackTracking;

public class FindSubsets {
    public static void main(String[] args) {
        String str = "abcdefg";
        findSubs(str, "", 0);
    }

    private static void findSubs(String str, String ans, int i) {
        //base
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.println("null");
            }else {
                System.out.println(ans);
            }
            return;
        }
        //yes
        findSubs(str, ans+str.charAt(i), i+1);
        //no
        findSubs(str, ans, i+1);
    }
}

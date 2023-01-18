package Javapaid.Strings;

public class BasicStrings {
    public static boolean isPalindrome(String str){
        for (int i = 0; i < str.length()/2; i++) {
            if (str.charAt(i)!=str.charAt((str.length()-1)-i)){
                //failed palindrome condition
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "0m";
        System.out.println(isPalindrome(str));
    }
}

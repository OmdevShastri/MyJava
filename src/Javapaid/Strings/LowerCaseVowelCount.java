package Javapaid.Strings;

import java.util.Scanner;

public class LowerCaseVowelCount {
    public static int theCount(String str){
        int count =0;
        for (int i = 0; i < str.length(); i++) {
           char ch = str.charAt(i);
           if ((ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch = 'u')) count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(theCount(str));
    }
}

package EverythingForAccenture;

import java.util.Scanner;

public class PasswdCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(CheckPassword(str));
    }

    private static int CheckPassword(String str) {
        //minimum length of 4
        if (str.length()<4)
            return 0;

        //Starting character must not be a number
        //if (str.charAt(0) - '0' >= 0 && str.charAt(0) - '0' <= 9)
        if (Character.isDigit(str.charAt(0)))
            return 0;

        int count=0;
        int num=0;
        for (int i = 0; i < str.length(); i++) {
            //Capital letter
            if (Character.isUpperCase(str.charAt(i))){
                count++;
            }
            //no space
            if (str.charAt(i)==' '||str.charAt(i)=='/'){
                return 0;
            }
            //one numeric
            //if (str.charAt(i) - '0' >= 0 && str.charAt(i) - '0' <= 9) {
            if (Character.isDigit(str.charAt(i)))
                num++;
        }

        return count>=1&&num>=1? 1:0;
    }
}

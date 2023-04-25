package Javapaid.Practice;

import java.util.*;

class isPalin {
    public static boolean isPalindrome(int x) {
        int save =x;
        int test =0;
        while(x>0){
            int i =0;
            test = test*10+(x%10) ;
            x = x/10;
            i++;
        }
        return test == save;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(isPalindrome(x));
    }
}
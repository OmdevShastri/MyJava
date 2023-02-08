package Javapaid.BitManipulation;

import java.util.Scanner;

public class OddOrEven {
    public static String check(int n){
        int bitMask = 1;
        if ((n & bitMask)== 0){
            return "Is even";
        }
        return "Is odd";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(check(n));
    }
}

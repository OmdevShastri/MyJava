package Javapaid.Recursion;

import java.util.Scanner;

public class XtoNPower {

    public static void main(String[] args) {
        System.out.println("X ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(findXtoN(x,n));
    }

    private static long findXtoN(int x, int n) {
        if (n <=0) {
            return 1;
        }
        return x*findXtoN(x,n-1);

    }
    private static long findXtoNOp(int x, int n) { //O(logN)
        if (n <=0) {
            return 1;
        }
        long halfPow = findXtoNOp(x, n/2);
        long halfPowSq = halfPow *halfPow;
        if (n %2 !=0) {
            halfPowSq = halfPowSq *x;
        }
        return halfPowSq;

    }
}

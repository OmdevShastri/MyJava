package Javapaid.Recursion;

import java.util.Scanner;

public class NNaturalSum {
    public static int nSum(int n){
        if (n == 1) {
            return 1;
        }
        return n+ nSum(n-1);
    }
    public static void main(String[] args) {
        System.out.println("Sum of ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(nSum(n));
    }
}

package Javapaid.BitManipulation;

import java.util.Scanner;

public class SwapWithBits {
    static void swapValuesUsingXOROperator(int m, int n)
    {
        System.out.println("Before");
        System.out.println("Value of m is " + m
                + " and Value of n is " + n);
        // Logic of XOR operator
        m = m ^ n;
        n = m ^ n;
        m = m ^ n;

        System.out.println("Value of m is " + m
                + " and Value of n is " + n);
    }
    public static void main(String[] args) {
        // Random two integer numbers
        // to get swapped
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        // Calling the function in main method
        // to get above integer numbers swapped
        swapValuesUsingXOROperator(m, n);
    }
}

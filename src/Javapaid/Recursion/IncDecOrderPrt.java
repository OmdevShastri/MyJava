package Javapaid.Recursion;

import java.util.Scanner;

public class IncDecOrderPrt {
    public static void prtDec(int n){
        if (n == 1) {
            System.out.println(1);
            return;
        }
        System.out.println(n);
        prtDec(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a num");
        int num = sc.nextInt();
        prtDec(num);

    }
}

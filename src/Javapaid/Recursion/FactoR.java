package Javapaid.Recursion;

import java.util.Scanner;

public class FactoR {
    public static int fact(int f){
        if (f <0) {
            return -1;
        }
        if (f == 0) {
            return 1;
        }
        return f * fact(f-1);
    }
    public static void main(String[] args) {
        System.out.println("Fact of ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fact(n));
    }
}

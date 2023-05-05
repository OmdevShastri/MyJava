package RandomQs;

import java.util.Scanner;

public class HourGlass {
    public static void printPattern(int n){
        for (int i = 0; i < n; i++) {
            //spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            //stars
            for (int j = n; j > i; j--) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        //bottom half
        for (int i = 0; i < n-1; i++) {
            //spaces
            for (int j = n; j > i+2; j--) {
                System.out.print(" ");
            }
            //stars
            for (int j = 0; j <= i+1; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        printPattern(n);
    }
}

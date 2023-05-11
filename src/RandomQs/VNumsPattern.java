package RandomQs;

import java.util.Scanner;

public class VNumsPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();

        for (int i = 1; i <= n; i++) {
            //initial spaces
            for (int j = 0; j <i ; j++) {
                System.out.print(" ");
            }

            //Num
            if (i<n)
            System.out.print(i);
            //SpaceNum
            for (int j = 2*n-i; j > i+1; j--) {
                System.out.print(" ");
            }
            if (i==n){
                System.out.print(n);
            }else {
                System.out.print(i);
            }
            System.out.println();
        }

    }
}

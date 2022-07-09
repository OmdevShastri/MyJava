package GettingMyGroundBack.noobstuff;

import java.util.Scanner;

public class patterns {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("rows pls");
        int n = sc.nextInt();
        System.out.println("columns pls");
        int m = sc.nextInt();

        for (int i =0; i<n;i++){
//            if (i==0 || i==n){
//                System.out.println("*");
//            }else
//                System.out.println(" ");

            for (int j = 0; j<m;j++){
                if (i==0 || j==0 || i==n-1 || j==m-1){
                    System.out.print("*");
                }else
                    System.out.print(" ");
            }
            System.out.println();
        }

    }
}

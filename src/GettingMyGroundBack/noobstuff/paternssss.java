package GettingMyGroundBack.noobstuff;

import java.util.Scanner;

public class paternssss {
    public static void main(String [] args){
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();

        for (int i =1; i<=n; i++ ){
            for (int j=1; j<=i ;j++){
                if (j==1||j==i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            for (int j=1; j<=2*(n-i) ;j++){
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                if (j==1||j==i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        for (int i =n; i>=1; i-- ){
            for (int j=i; j>=1 ;j--){
                if (j==1||j==i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            for (int j=2*(n-i); j>=1 ;j--){
                System.out.print(" ");
            }
            for (int j=i; j>=1 ;j--){
                if (j==1||j==i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}

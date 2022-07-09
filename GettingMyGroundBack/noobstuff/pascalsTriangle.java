package GettingMyGroundBack.noobstuff;

import java.util.*;

public class pascalsTriangle {
    public int fact(int a){
        if(a==0){
            return 1;
        }else
            return a * fact(a-1);
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        pascalsTriangle p = new pascalsTriangle();

        for (int i = 0; i<=n;i++){
            //spaces
            for (int j=0; j<=n-i; j++){
                System.out.print(" ");
            }
            //nums
            for (int j=0;j<=i;j++){
                System.out.print(p.fact(i)/(p.fact((i-j))*p.fact(j)) + " ");
            }
            System.out.println();
        }

    }
}

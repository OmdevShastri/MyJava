package GettingMyGroundBack.noobstuff;

import java.util.Scanner;

public class prac1GCD {
    public static int gcd(int a,int b){
        if (b==0){
            return a;
        }

        return gcd(b,a%b);
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Provide 2 numbers to find GDC of: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println("The answer is: "+ gcd(num1,num2));

    }
}

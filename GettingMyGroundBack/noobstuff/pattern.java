package GettingMyGroundBack.noobstuff;

import java.util.Scanner;

public class pattern {
    public static void main(String[] args){
//        System.out.println("*");
//        System.out.println("**"); //haha, such noob code XD
//        System.out.println("***");
        System.out.println("My my");

        //variables
        String name="wahahaha";
        int age=10000;
        double price =23.33;
        /*
        Primitive
        byte-1byte
        short - 2
        char - 2
        boolean - 1
        int- 4
        long - 8
        float - 4
        double - 8

        Non-Primitive
        String
        Array
        Class
        Object
        Interface
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=0;i<n;i++){
            System.out.println("****");
            for (int j=0;j<i;j++){
                System.out.print("*");
            }
        }

    }
}

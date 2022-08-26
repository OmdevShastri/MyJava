package Javapaid;

import java.util.Scanner;

public class basicsJava {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
//        boolean bobo = sc.nextBoolean();
//        System.out.println(bobo);
        int $ = 24;

        //Q1
        System.out.println("Enter a number to check: ");
        int n = sc.nextInt();
        if (n>0){
            System.out.println("Its a +ve number");
        } else if (n<0) {
            System.out.println("Its a -ve number");
        }else{
            System.out.println("Its zero");
        }

        //Q4
        //x= false; y = 63

    }
}

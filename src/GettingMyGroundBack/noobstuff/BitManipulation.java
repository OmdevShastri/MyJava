package GettingMyGroundBack.noobstuff;

import java.util.*;

public class BitManipulation {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        //Get bit
        int n = 5;
        int pos = 1;
        int bitMask = 1<<pos;
        int notbitMask = ~(bitMask); //for clear bit
        int oper = sc.nextInt(); //update bit to 1 else update to 0


        if ((bitMask & n)==0){
            System.out.println("was  zero");
        }else
            System.out.println("was one");

        //Set bit
        int newNum = bitMask | n;
        System.out.println(newNum);
        //Clear bit
        int newNumm = notbitMask & n;
        System.out.println(newNumm);
        //Update bit
        if (oper == 1){
            int newNummm =bitMask | n;
            System.out.println(newNummm);
        }else {
            int newBitMask = ~(bitMask);
            int newNummmm = newBitMask & n;
            System.out.println(newNummmm);
        }

    }
}

package Javapaid.BitManipulation;

import java.util.Scanner;

public class OperationsGetSetClear {
    public static int getBit(int n, int i){
        int bitMask = 1<<i;
        if ((n & bitMask) == 0){
            return 0;
        }
        return 1;
    }
    public static int setBit(int n, int i){
        int bitMask = 1<<i;
        return bitMask | n;
    }
    public static int clearBit(int n, int i){
        int bitMask = ~(1<<i);
        return n & bitMask;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(getBit(n, 3));
        System.out.println(setBit(n, 3));
        System.out.println(clearBit(n, 3));
    }
}

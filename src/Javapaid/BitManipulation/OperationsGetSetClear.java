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
    public static int updateIthBit(int n, int i, int newBt){
//        if (newBt == 0)
//            return clearBit(n,i);
//       else
//           return setBit(n,i);
        int bitMask = 1<<i;

        return (n & ~bitMask) | ((newBt<<i) & bitMask);


    }
    public static int clearLastIthBits(int n, int i){
        int bitmask = (~0)<<i;
        return n & bitmask;
    }
    public static int clearIBitsInRange(int n, int i, int j){ //Q1
        int a = ((~0)<<(j+1));
        int b = (1<<i)-1;
        int bitMask = a|b;

        return bitMask & n;
    }
    public static boolean checkPowerOf2(int n){// Q2
        return ((n & (n-1))  == 0);
    }
    public static int countSetBits(int n){
    int count =0;
    while(n >0){
        if ((n & 1) !=0){
            count++;
        }
        n = n>>1;
    }
    return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Eneter an Integer");
        int n = sc.nextInt();
        System.out.println(getBit(n, 3));
        System.out.println(setBit(n, 3));
        System.out.println(clearBit(n, 3));
        System.out.println(updateIthBit(7,3,1));
        System.out.println(clearLastIthBits(n, 2));
        System.out.println(clearIBitsInRange(10, 2,4));
        System.out.println(checkPowerOf2(8));
        System.out.println(countSetBits(15));
    }
}

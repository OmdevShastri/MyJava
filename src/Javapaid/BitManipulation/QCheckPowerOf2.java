package Javapaid.BitManipulation;

public class QCheckPowerOf2 {
    public static boolean checkPowerOf2(int n){// Q2
        return ((n & (n-1))  == 0);
    }
    public static void main(String[] args) {
        System.out.println(checkPowerOf2(8));
    }
}

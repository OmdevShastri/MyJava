package Javapaid.BitManipulation;

public class QClearIBitsInRange {
    public static int clearIBitsInRange(int n, int i, int j){ //Q1
        int a = ((~0)<<(j+1));
        int b = (1<<i)-1;
        int bitMask = a|b;

        return bitMask & n;
    }
    public static void main(String[] args) {
        System.out.println(clearIBitsInRange(10, 2,4));
    }
}

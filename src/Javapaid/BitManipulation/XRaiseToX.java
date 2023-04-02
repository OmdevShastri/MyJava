package Javapaid.BitManipulation;

import java.math.BigInteger;

public class XRaiseToX {
    public static long findXRaisedToX(long x){
        long ans= 1;
        long n=x;
        while (n > 0) {
            if ((n & 1)!=0){
                ans = ans * x;
            }
            x = x * x;
            n = n>>1;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(findXRaisedToX(54));
    }
}

package EverythingForAccenture;

import java.util.Scanner;

public class SumDiffDivAndNot {
    public static int differenceofSum(int n, int m){
        int sumD =0, sumND =0;
        for (int i = 1; i <= m; i++) {
            if (i%n==0){
                sumD+=i;
            }else {
                sumND+=i;
            }
        }
        return sumND-sumD;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int m = sc.nextInt();
        System.out.println(differenceofSum(n,m));
    }
}

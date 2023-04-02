package RandomQs;

import java.util.Scanner;

public class nPr {
    public static int facto(int n){
        int fact = 1;
        if (n == 1) {
            return 1;
        }
        for (int i = 2; i <= n; i++) {
            fact = fact *i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        // nPr formula => n!/(n-r)!
        System.out.println(facto(n)/facto(n-r));

    }
}

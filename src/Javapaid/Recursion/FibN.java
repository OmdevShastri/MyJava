package Javapaid.Recursion;

import java.util.HashMap;
import java.util.Scanner;

public class FibN {
    static HashMap<Integer,Integer> hashMap = new HashMap<>();
    public static int nFib(int n){
        if (n == 0) {
            return 0;
        }
        if (n == 1|| n==2) {
            return 1;
        }
        if (hashMap.containsKey(n)) {
            return hashMap.get(n);
        }

        int val = nFib(n-1)+nFib(n-2);
        hashMap.put(n, val);

        return val;
    }
    public static void main(String[] args) {
        System.out.println("Fib of ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(nFib(n));
    }
}

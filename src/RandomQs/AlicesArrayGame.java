package RandomQs;

import java.util.Scanner;

public class AlicesArrayGame {

    public static boolean isPrime(int n){
        if (n==2){
            return true;
        }
        for (int i =2; i<=Math.sqrt(n); i++){
            if (n%i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void answer(int n, int[] arr){
        for (int i = 1; i <=n; i++) {
            if ((!isPrime(i)&&isPrime(arr[i]))||i==1){
                System.out.print(arr[i]+" ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int [n+1];

        //input
        for (int i = 1; i <=n; i++) {
                arr[i] = sc.nextInt();
        }
        answer(n, arr);
    }
}

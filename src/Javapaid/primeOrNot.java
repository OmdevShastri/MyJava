package Javapaid;
import java.util.*;

public class primeOrNot {
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
    public static void primesTill(int n){
        for (int i = 2; i<=n; i++){
            System.out.println("The number "+i+" is"+(isPrime(i)?" prime":" not prime"));
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        //System.out.println("The number");
        primesTill(num);
    }
}

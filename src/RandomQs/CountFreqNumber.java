package RandomQs;

import java.util.Scanner;

public class CountFreqNumber {
    public static int countD(int N, int D){
        int count =0;

        while(N>0){
            if (N%10 == D ){
                count ++;
            }
            N= N/10;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Which digit to count?");
        int d = sc.nextInt();
        System.out.println("The digit "+d +" appears "+countD(num, d)+ " times");
    }
}

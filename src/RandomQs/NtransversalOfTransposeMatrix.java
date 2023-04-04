package RandomQs;

import java.util.Scanner;

public class NtransversalOfTransposeMatrix {
    public static void answer(int n, int [][] arr){

        //printing the N Traversal
        for (int i = 0; i < n; i++) {
            if (i==0 || i==n-1){
                for (int j = n-1; j >=0; j--) {
                    System.out.print(arr[i][j]+" ");
                }

            }else {
                System.out.print(arr[i][i]+ " ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][] arr = new int[n][n];

        //input
        for (int i = 0; i <n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        answer(n, arr);

    }
}

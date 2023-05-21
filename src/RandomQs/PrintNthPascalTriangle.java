package RandomQs;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintNthPascalTriangle {
    public static int fact(int a){
        if(a==0){
            return 1;
        }else
            return a * fact(a-1);
    }
    public static void main(String[] args) {
        System.out.println("Give an n= ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> ans= new ArrayList<>();

          //nums just printing
//        for (int j=0;j<n;j++){
//            System.out.print(fact(n-1)/(fact((n-1-j))*fact(j)) + " ");
//        }

        //with array list
        for (int j=0;j<n;j++){
           ans.add(fact(n-1)/(fact((n-1-j))*fact(j)));
        }
        System.out.println(ans.toString());
    }
}

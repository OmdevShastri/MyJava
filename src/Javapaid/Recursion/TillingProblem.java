package Javapaid.Recursion;

public class TillingProblem {
    public static void main(String[] args) {
        System.out.println(numWays(4));
    }
    public static int numWays(int n){// 2 x n (floor size
        //base
        if (n <=1) {
            return 1;
        }
        //vertical choice
        int vertTiles = numWays(n-1);

        //horiz choice
        int horizTiles = numWays(n-2);

        return vertTiles+horizTiles;
        
    }
}

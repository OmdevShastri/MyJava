package Javapaid.Recursion;

public class FriendsPairing {
    public static int pairEm(int n){
        if (n == 1 || n==2) {
            return n;
        }
//        //single
//        int f1 = pairEm(n-1);
//        //pair
//        int f2 = pairEm(n-2);
//        int pairWays = (n-1) = f2;
//
//        return f1+ pairWays;
        return pairEm(n-1)+ (n-1)* pairEm(n-2);

    }
    public static void main(String[] args) {
        System.out.println(pairEm(3));
    }
}

package Javapaid.BackTracking;

public class GridWays {

    public static void main(String[] args) {
        int n =3, m =3;
        System.out.println(gridWays(0,0,n,m));
    }

    private static int gridWays(int i, int j, int n, int m) {
        //base
        if (i == n-1 && j == m-1) { //last call
            return 1;
        } else if (i ==n || j ==m) { //boundary
            return 0;
        }
        //work
        int w1 = gridWays(i+1, j, n, m);
        int w2 = gridWays(i, j+1, n, m);
        return w1+w2;
    }
}

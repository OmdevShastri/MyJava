package Javapaid.Practice;

public class MatTranspose {
    public static int[][] calcTranspose(int[][] mat){
        int [][] result = new int[mat[0].length][mat.length];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                result[j][i]= mat[i][j];
            }
        }
        return result;
    }
    public static void prtArr(int[][] mat){
        for (int[] ints : mat) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int [][] mat = new int[][]{{10,20,30,40}, {15,25,35,45},{27,29,37,48}};//,{32,33,39,50}};
        prtArr(calcTranspose(mat));
    }
}

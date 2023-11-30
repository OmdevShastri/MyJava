package LeetCode;

public class SetMatrixZeroes {
    public static void main(String[] args) {
        int [][] matrix = {{1,1,1},{1,0,1},{1,1,1}};
        Solution.setZeroes(matrix);
        for (int[] ints : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(ints[j]);
            }
            System.out.println();
        }

    }
    static class Solution {
//        public static void setZeroes(int[][] matrix) {
//            boolean rowF= false;
//            boolean colF= false;
//
//            for (int i = 0; i < matrix.length; i++) {
//                for (int j = 0; j < matrix[0].length; j++) {
//                    if (matrix[i][j]==0 && rowF == false && colF == false){
//                        for (int k = i; k >= 0; k--) {
//                            matrix[k][j]=0;
//                        }
//                        for (int k = i; k < matrix.length; k++) {
//                            matrix[k][j]=0;
//                        }
//                        for (int k = j; k >= 0; k--) {
//                            matrix[i][k]=0;
//                        }
//                        for (int k = i; k < matrix[0].length; k++) {
//                            matrix[i][k]=0;
//                        }
//                        rowF = colF = true;
//                    }
//                }
//                ro
//            }
//        }
        public static void setZeroes(int[][] matrix) {
            int rowL = matrix.length, colL = matrix[0].length;
            boolean rowZero = false;

            //determine which rows/cols to zero
            for (int i = 0; i < rowL; i++) {
                for (int j = 0; j < colL; j++) {
                    if (matrix[i][j] == 0) {
                        matrix[0][j]=0;
                        if (i==0){
                            rowZero = true;
                        }else {
                            matrix[i][0]= 0;
                        }
                    }
                }
            }
            for (int i = 1; i < rowL; i++) {
                for (int j = 1; j < colL; j++) {
                    if (matrix[0][j]==0 ||matrix[i][0]==0){
                        matrix[i][j]=0;
                    }
                }
            }
            if (matrix[0][0]==0){
                for (int i = 0; i < rowL; i++) {
                    matrix[i][0] = 0;
                }
            }
            if (rowZero){
                for (int i = 0; i < colL; i++) {
                    matrix[0][i] =0;
                }
            }

        }
    }
}

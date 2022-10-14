package Javapaid.Arrays;

public class TwoDArrays {
    public static void printSpiral(int [][] mat){
        int startRow = 0;
        int endRow = mat.length-1;
        int startCol = 0;
        int endCol = mat[0].length-1;

        while(startCol<=endCol && startRow<=endRow){
            // top
            for (int j=startCol; j<=endCol; j++) {
                System.out.print(mat[startRow][j]+" ");
            }
            //right
            for (int i = startRow+1; i <=endRow ; i++) {
                System.out.print(mat[i][endCol]+" ");
            }
            //bottom
            for (int i = endCol-1; i >=startCol ; i--) {
                if (startCol == endCol)
                    return;
                System.out.print(mat[endRow][i]+" ");
            }
            //left
            for (int i = endRow-1; i >= startRow+1 ; i--) {
                System.out.print(mat[i][startCol]+" ");
            }
            startCol++;
            startRow++;
            endRow--;
            endCol--;
        }
        System.out.println();
    }
    public static int diagonalSum(int [][] mat){//O(n^2)
        int sum=0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (i==j){
                    sum+=mat[i][j];
                }else if (i+j == mat.length-1){
                    sum+=mat[i][j];
                }
            }            
        }
        return sum;
    }
    public static int optimisedDiagSum(int[][] mat){//O(n)
        int sum = 0;
        for (int i = 0; i < mat.length; i++) {
            //primary sum
            sum+= mat[i][i];
            //secondary sum
            if (i!= mat.length-1-i)
                sum += mat[i][mat.length-1-i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int [][] matrix ={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        printSpiral(matrix);
        System.out.println(diagonalSum(matrix));
        System.out.println(optimisedDiagSum(matrix));

    }
}

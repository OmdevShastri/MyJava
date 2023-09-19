package Javapaid.BackTracking;

public class SudokuSingleSolution {
    public static boolean sudokuSolver(int [][] sudoku, int row, int col){
        //base
        if (row ==9 && col == 0){
            return true;
        }
        //work
        int nextRow = row, nextCol = col+1;
        if (col+1 ==9){
            nextRow = row+1;
            nextCol =0;
        }

        if (sudoku[row][col] !=0){
            return sudokuSolver(sudoku,nextRow,nextCol);
        }

        for (int i = 1; i <=9 ; i++) {
            if (isSafe(sudoku, row, col, i)){
                sudoku[row][col] = i;
                if(sudokuSolver(sudoku, nextRow,nextCol)){//sol exists
                    return  true;
                }
                sudoku[row][col] =0;
            }
        }
        return false;
    }

    private static boolean isSafe(int[][] sudoku, int row, int col, int i) {
        //column
        for (int j = 0; j <=8; j++) {
            if (sudoku[j][col] == i){
                return false;
            }
        }
        //row
        for (int j = 0; j <=8; j++) {
            if (sudoku[row][j] == i){
                return false;
            }
        }
        //grid
        int sr = (row/3)*3;
        int sc = (col/3)*3;
        //3x3 grid
        for (int j = sr; j < sr+3; j++) {
            for (int k = sc; k <sc+3; k++) {
                if (sudoku[j][k] == i){
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {

        int [][] sud = {{0,0,8,0,0,0,0,0,0},
                {4,9,0,1,5,7,0,0,2},
                {0,0,3,0,0,4,1,9,0},
                {1,8,5,0,6,0,0,2,0},
                {0,0,0,0,2,0,0,6,0},
                {9,6,0,4,0,5,3,0,0},
                {0,3,0,0,7,2,0,0,4},
                {0,4,9,0,3,0,0,5,7},
                {8,2,7,0,0,9,0,1,3}};

        if (sudokuSolver(sud, 0,0)){
            System.out.println("Solution exists");
            printSudoku(sud);
        }else {
            System.out.println("N/A");
        }
    }

    private static void printSudoku(int[][] sud) {
        for (int i = 0; i <9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(sud[i][j] + " ");
            }
            System.out.println();
        }
    }
}

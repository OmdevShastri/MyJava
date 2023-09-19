package Javapaid.BackTracking;

import java.util.Scanner;

public class NQueens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        char [][] board = new char[n][n];
        //initialize
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] ='x';
            }
        }
        if (nQueensOnlyOne(board, 0)){
            System.out.println("Possible");
            printBoard(board);
        }else {
            System.out.println("Not Possible");
        }
        //System.out.println("Total ways = " + count);
    }

    static int count =0;

    private static void nQueens(char[][] board, int row) {
        //base
        if (row == board.length ) {
            //printBoard(board);
            count++;
            return;
        }
        //work-column loop
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)){
                board[row][j] = 'Q';
                nQueens(board, row+1); //function call
                board[row][j] = 'x'; // backtracking step
            }

        }

    }

    private static boolean nQueensOnlyOne(char[][] board, int row) {
        //base
        if (row == board.length ) {
            //printBoard(board);
            //count++;
            return true;
        }
        //work-column loop
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)){
                board[row][j] = 'Q';
                if (nQueensOnlyOne(board, row+1)){
                    return true; //function call
                }
                board[row][j] = 'x'; // backtracking step
            }

        }
        return false;
    }

    private static boolean isSafe(char[][] board, int row, int col) {
        //vertical
        for (int i = row-1; i >=0; i--) {
            if (board[i][col] =='Q')
                return false;
        }
        //diag left-up
        for (int i = row-1,j = col-1; i>=0 && j>=0; i--,j--) {
            if (board[i][j]=='Q')
                return false;
        }
        //diag-right-up
        for (int i = row-1,j = col+1; i>=0 && j< board.length; i--,j++) {
            if (board[i][j]=='Q')
                return false;
        }

        return true;
    }

    private static void printBoard(char[][] board) {
        System.out.println("----------chess board----------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j]+ " ");
            }
            System.out.println();
        }
    }
}

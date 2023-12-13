package LeetCode;

public class WordSearch {
    public static void main(String[] args) {
        
    }
    class Solution {
//        public boolean exist(char[][] board, String word) {
//            char start;
//            char c = word.charAt(0);
//            int idx, idy;
//            for (int i = 0; i < board.length; i++) {
//
//                for (int j = 0; j < board[0].length; j++) {
//
//                    char curr = board[i][j];
//                    if (c==curr&&(board[i][j-1]==word.charAt(1)||board[i][j+1]==word.charAt(1)||board[i-1][j]==word.charAt(1)||board[i+1][j]==word.charAt(1))){
//
//                        idx=i;
//                        idy=j;
//                        break;
//                    }
//                }
//            }
//
//            return false;
//        }
        public boolean exist(char[][] board, String word) {
            int m = board.length;
            int n = board[0].length;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (check(board, word, i, j, m, n, 0)) {
                        return true;
                    }
                }
            }
            return false;
        }
        public boolean check(char[][] board,String word,int i,int j,int m,int n,int cur) {
            if (cur >= word.length()) {
                return true;
            }
            if (i < 0 ||j < 0 ||i >= m ||j >= n ||board[i][j] != word.charAt(cur)) {
                return false;
            }
            boolean exist = false;
            if (board[i][j] == word.charAt(cur)) {
                board[i][j] += 100;
                exist =
                        check(board, word, i + 1, j, m, n, cur + 1) ||
                                check(board, word, i, j + 1, m, n, cur + 1) ||
                                check(board, word, i - 1, j, m, n, cur + 1) ||
                                check(board, word, i, j - 1, m, n, cur + 1);
                board[i][j] -= 100;
            }
            return exist;
        }
    }
}

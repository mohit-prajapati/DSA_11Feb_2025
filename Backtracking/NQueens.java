package Backtracking;

public class NQueens {

    public static int count = 0;

    public static boolean isSafe(char[][] board, int row, int col) {
        // vertical up
        for (int i = row; i >= 0; i--) {
            if (board[i][col] == (char) 'Q') {
                return false;
            }
        }

        // diagonal left up
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == (char) 'Q') {
                return false;
            }
        }

        // diagonal right up
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == (char) 'Q') {
                return false;
            }
        }

        return true;
    }

    public static boolean nQueens(char[][] board, int row) { // for print one solution
        // public static void nQueens(char[][] board, int row) {
        // base case
        if (row == board.length) {
            // printBoard(board);
            count++;
            // return;
            return true;
        }

        // recursion
        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = (char) 'Q';
                // nQueens(board, row + 1); // function call
                if (nQueens(board, row + 1)) { // for print one solution
                    return true;
                }
                board[row][col] = (char) 'x'; // Backtracking
            }
        }
        return false;
    }

    public static void printBoard(char[][] board) {
        System.out.println("--------- Chess Board ---------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        char[][] board = new char[n][n];

        // initialize
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = (char) 'x';
            }
        }

        // nQueens(board, 0);
        if (nQueens(board, 0)) {
            System.out.println("Solution is possible");
            printBoard(board);
        } else {
            System.out.println("Solution is not possible");
        }
        // System.out.println("Total ways to place Queens: " + count);
    }
}

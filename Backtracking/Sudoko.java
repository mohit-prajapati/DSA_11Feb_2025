package Backtracking;

public class Sudoko {
    public static boolean isSafe(int sudoko[][], int row, int col, int digit) {
        // for column
        for (int i = 0; i <= 8; i++) {
            if (sudoko[i][col] == digit) {
                return false;
            }
        }

        // for row
        for (int j = 0; j <= 8; j++) {
            if (sudoko[row][j] == digit) {
                return false;
            }
        }

        // for grid
        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;
        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (sudoko[i][j] == digit) {
                    return false;
                }
            }
        }

        return true;
    }

    public static boolean sudokoSolver(int sudoko[][], int row, int col) {
        // base case
        if (row == 9 && col == 0) {
            return true;
        }

        // recursion
        int nextRow = row, nextCol = col + 1;
        if (col + 1 == 9) {
            nextRow = row + 1;
            nextCol = 0;
        }

        if (sudoko[row][col] != 0) {
            return sudokoSolver(sudoko, nextRow, nextCol);
        }

        for (int digit = 1; digit <= 9; digit++) {
            if (isSafe(sudoko, row, col, digit)) {
                sudoko[row][col] = digit;
                if (sudokoSolver(sudoko, nextRow, nextCol)) { // solution exist
                    return true;
                }
                sudoko[row][col] = 0;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int sudoko[][] = { { 3, 0, 6, 5, 0, 8, 4, 0, 0 }, { 5, 2, 0, 0, 0, 0, 0, 0, 0 }, { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
                { 0, 0, 3, 0, 1, 0, 0, 8, 0 }, { 9, 0, 0, 8, 6, 3, 0, 0, 5 }, { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
                { 1, 3, 0, 0, 0, 0, 2, 5, 0 }, { 0, 0, 0, 0, 0, 0, 0, 7, 4 }, { 0, 0, 5, 2, 0, 6, 3, 0, 0 } };

        if (sudokoSolver(sudoko, 0, 0)) {
            System.out.println("solution exist");
            printSudoko(sudoko);
        } else {
            System.out.println("solution does not exist");
        }

    }

    public static void printSudoko(int sudoko[][]) {
        for (int i = 0; i < sudoko.length; i++) {
            for (int j = 0; j < sudoko.length; j++) {
                System.out.print(sudoko[i][j] + " ");
            }
            System.out.println();
        }
    }

}

package Arrays2D.TwoDarray_questions;

public class FindingTranspose {

    public static void printMatrix(int arr[][]) {
        System.out.println("The matrix is: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }
    }
    public static void main(String[] args) {
        int row = 2, column = 3;
        int[][] arr = {{1, 2, 3}, {4, 5, 6}};

        // display original array
        printMatrix(arr);

        // transpose the matrix
        int[][] transpose = new int[column][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                transpose[j][i] = arr[i][j];
            }
        }

        // print the transpose matrix
        printMatrix(transpose);
    }
}

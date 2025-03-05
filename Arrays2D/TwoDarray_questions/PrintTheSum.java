package Arrays2D.TwoDarray_questions;

public class PrintTheSum {
    public static int printTheSum(int arr[][]) {
        int sum = 0;
        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = 0; j < arr[i].length; j++) {
        //         if (i == 1) {
        //             sum += arr[i][j];   
        //         }
        //     }
        // }

        for (int i = 0; i < arr[0].length; i++) {
            sum += arr[1][i];
        }

        return sum;
    }
    public static void main(String[] args) {
        int[][] arr = {{1, 4, 9}, {11, 4, 3}, {2, 2, 3}};
        System.out.print(printTheSum(arr));
    }
}

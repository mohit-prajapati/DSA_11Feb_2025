package Backtracking;

public class GridWays {
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static int gridWays(int i, int j, int n, int m) {
        // base case
        if (i == n - 1 && j == m - 1) { // condition for last cell
            return 1;
        } else if (i == n || j == m) { // condition for out of bound
            return 0;
        }

        // int w1 = gridWays(i + 1, j, n, m);
        // int w2 = gridWays(i, j + 1, n, m);
        // return w1 + w2;

        // using parmitation
        int numerator = factorial(n + m - 2);
        int denominator = factorial(n - 1) * factorial(m - 1);
        int count = numerator / denominator;
        return count;
    }

    public static void main(String[] args) {
        int n = 3, m = 3;
        System.out.println(gridWays(0, 0, n, m));
    }
}

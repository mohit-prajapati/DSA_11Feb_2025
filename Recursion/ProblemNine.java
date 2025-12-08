// Q9: Print X^N

package Recursion;

public class ProblemNine {
    // public static int power(int x, int n) { // O(n)
    //     if (n == 0) {
    //         return 1;
    //     }

    //     return x * power(x, n-1);
    // }

    // optimized approach // 10
    public static int power(int x, int n) { // O(log n)
        if (n == 0) {
            return 1;
        }

        int halfPower = power(x, n/2);
        int halfPowerSq = halfPower * halfPower;

        // n is odd
        if (n % 2 != 0) {
            halfPowerSq = x * halfPowerSq;
        }

        return halfPowerSq;
    }
    public static void main(String[] args) {
        int x = 2;
        int n = 10;
        System.out.println(power(x, n));
    }
}

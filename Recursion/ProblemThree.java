// Q3: Print Factorial of a Number

package Recursion;

public class ProblemThree {
    public static int printFact(int n){
        if(n == 0){
            return 1;
        }

        n = n * printFact(n-1);

        return n;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(printFact(n));
    }
}
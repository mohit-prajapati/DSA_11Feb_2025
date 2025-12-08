// Q5: Print nth Fibonacci Number

package Recursion;

public class ProblemFive {
    public static int printFib(int n){
        if(n == 0 || n == 1){
            return n;
        }

        n = printFib(n-1) + printFib(n-2);

        return n;
    }
    public static void main(String[] args) {
        int n = 10;
        System.out.println(printFib(n));
    }
    
}

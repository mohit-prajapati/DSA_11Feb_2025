// Q4: Print Sum of First n Natural Numbers

package Recursion;

public class ProblemFour {
    public static int printSum(int n){
        if(n == 1){
            return 1;
        }

        n = n + printSum(n-1);
        return n;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(printSum(n));
    }
    
}

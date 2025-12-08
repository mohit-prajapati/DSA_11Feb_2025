package Recursion.Practic_questions;

public class question2 {
    // Q.2: You are given a number (eg -  2019), convert it into a String of english like“two zero one nine”.  Use a recursive function to solve this problem.NOTE-Thedigitsofthenumberwillonlybeintherange0-9andthelastdigitofanumbercan’t be 0.
    // Sample Input: 1947
    // Sample Output: “one nine four seven”

    public static void printEnglish(int n)
    {
        if(n == 0){
            return;
        }

        String digits[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        int lastDigit = n % 10;
        printEnglish(n/10);
        System.out.print(digits[lastDigit] + " ");
    }

    public static void main(String[] args) {
        int n = 1947;
        printEnglish(n);
    }
}

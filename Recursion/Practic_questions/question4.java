package Recursion.Practic_questions;

public class question4 {
    /**
     * We are given a string S,we need to find the count of all contiguous substrings that start and end with the same character.
     * Sample Input 1: S = "abcab"
     * Sample Output 1: 7
     * There are 15 substrings of "abcab" : a, ab, abc, abca, abcab, b, bc, bca, bcab, c, ca, cab, a, ab, b
     * Out of the above substrings, there are 7 substrings: a, abca, b, bcab, c, a and b. So, only 7 contiguous substrings start and end with the same character.
     * Sample Input 2: S = "aba"
     * Sample Output 2: 4
     * The substrings are a, b, a and aba.
     * 
     * 
     */

     public static int countSubstrings(String s, int i, int j)
     {
        // Base cases
        if (i > j)
            return 0;
        if (i == j)
            return 1; // single character

        // Recursive formula
        int res = countSubstrings(s, i + 1, j)
                + countSubstrings(s, i, j - 1)
                - countSubstrings(s, i + 1, j - 1);

        // If chars at i and j are same, add 1 for s[i...j]
        if (s.charAt(i) == s.charAt(j)) {
            res++;
        }

        return res;

        // if(n == 1) {
        //     return 1;
        // }

        // if (n <= 0) {
        //     return 0;
        // }

        // int res = countSubstrings(s, i+1, j, n-1) + countSubstrings(s, i, j-1, n-1) + countSubstrings(s, i+1, j-1, n-2);

        // if (s.charAt(i) == s.charAt(j)) {
        //     res++;
        // }

        // return res;

     }

     public static void main(String[] args) {
        String s = "aba";
        System.out.println(countSubstrings(s, 0, s.length()-1));
     }
}

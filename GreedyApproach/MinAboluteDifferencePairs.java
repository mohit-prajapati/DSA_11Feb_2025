package GreedyApproach;

import java.util.*;

public class MinAboluteDifferencePairs {
    public static void main(String[] args) { // O(nlogn)
        // int a[] = { 4, 1, 8, 7 };
        int a[] = { 1, 2, 3 };
        int b[] = { 1, 2, 3 };
        // int b[] = { 2, 3, 6, 5 };

        // sort both array
        Arrays.sort(a);
        Arrays.sort(b);

        int diff = 0;

        for (int i = 0; i < a.length; i++) {
            diff += Math.abs(a[i] - b[i]);
        }

        System.out.println("Min absolute difference = " + diff);
    }
}

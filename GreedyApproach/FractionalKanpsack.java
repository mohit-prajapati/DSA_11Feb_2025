package GreedyApproach;

import java.util.*;

public class FractionalKanpsack {
    public static void main(String[] args) {
        int val[] = { 60, 100, 120 };
        int wt[] = { 10, 20, 30 };
        int W = 50;

        double ratio[][] = new double[val.length][2];

        // 0th col => 1st col => ratio
        for (int i = 0; i < val.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = val[i] / (double) wt[i];
        }

        // ascending order sort ratio array
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        int capacity = W;
        int totalValue = 0;

        for (int i = ratio.length - 1; i >= 0; i--) {
            int idx = (int) ratio[i][0];
            if (capacity >= wt[idx]) { // include full item
                totalValue += val[idx];
                capacity -= wt[idx];
            } else {
                // include fractional part
                totalValue += (ratio[i][1] * capacity);

                break;
            }
        }

        System.out.println("Total Value = " + totalValue);
    }
}

package ArrayList;

import java.util.ArrayList;

public class PairSum {
    public static void pairSum(ArrayList<Integer> list, int target) {

        // Brute Force O(n^2)
        // for (int i = 0; i < list.size(); i++) {
        // for (int j = i + 1; j < list.size(); j++) {
        // if (list.get(i) + list.get(j) == target) {
        // System.out.println(list.get(i) + ", " + list.get(j));
        // }
        // }
        // }

        // 2 Pointer approach O(n)
        int lp = 0;
        int rp = list.size() - 1;

        while (lp < rp) {
            // Calculate sum
            int sum = list.get(lp) + list.get(rp);

            if (sum == target) {
                System.out.println(list.get(lp) + ", " + list.get(rp));
                lp++;
                rp--;

            } else if (sum < target) {
                lp++;
            } else {
                rp--;
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        pairSum(list, 5);
    }
}

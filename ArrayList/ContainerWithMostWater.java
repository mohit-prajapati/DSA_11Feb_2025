package ArrayList;

import java.util.ArrayList;

public class ContainerWithMostWater {
    public static int storeWater(ArrayList<Integer> height) {
        int maxArea = 0;
        // Brute Force O(n^2)
        // for (int i = 0; i < height.size(); i++) {
        // for (int j = i + 1; j < height.size(); j++) {
        // int ht = Math.min(height.get(i), height.get(j));
        // int width = j - i;
        // int currWater = ht * width;
        // maxArea = Math.max(maxArea, currWater);
        // }
        // }

        // 2 Pointer approach O(n)
        int lp = 0;
        int rp = height.size() - 1;
        while (lp < rp) {
            // Calculate water area
            int ht = Math.min(height.get(lp), height.get(rp));
            int width = rp - lp;
            int currWater = ht * width;

            maxArea = Math.max(maxArea, currWater);

            // Update pointer
            if (height.get(lp) <  height.get(rp)) {
                lp++;
            } else {
                rp--;
            }
        }

        return maxArea;
    }

    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();

        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println(storeWater(height));
    }
}

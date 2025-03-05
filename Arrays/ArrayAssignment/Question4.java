package Arrays.ArrayAssignment;

public class Question4 {
    public static int trappedWater(int[] height)
    {
        int n = height.length;
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++){
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }

        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];

        for (int i = n-2; i >= 0; i--){
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }

        int trappedWater = 0;
        for (int i = 0; i < n; i++){
            int waterLevel = Math.min(leftMax[i], rightMax[i]);

            trappedWater += waterLevel - height[i];
        }

        return trappedWater;
    }

    // Approach 2: 
    public static int trappedWater2(int height[]){
        int n = height.length;
        int res = 0, left = 0, right = n-1;
        int rMax = height[right], lMax = height[left];

        while(left < right){
            if(lMax < rMax){
                left++;
                lMax = Math.max(lMax, height[left]);
                res += lMax - height[left];
            }else{
                right--;
                rMax = Math.max(rMax, height[right]);
                res += rMax - height[right];
            }
        }

        return res;
    }
    public static void main(String[] args) {
        int height[] = {4, 2, 0, 3, 2, 5};
        System.out.println("The trapped water is " + trappedWater2(height));
    }
}

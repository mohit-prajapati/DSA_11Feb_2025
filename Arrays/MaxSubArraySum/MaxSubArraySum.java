package Arrays.MaxSubArraySum;

public class MaxSubArraySum {

    public static void maxSubArraySum(int numbers[]){
        int maxSum = Integer.MIN_VALUE;

        for(int i = 0; i < numbers.length; i++){
            for(int j = i; j < numbers.length; j++){
                int currSum = 0;
                for(int k = i; k <= j; k++){
                    //subarray sum
                    currSum += numbers[k];
                }

                System.out.println("Sum of subarray " + currSum);

                if(currSum > maxSum){
                    maxSum = currSum;
                }
            }
            System.out.println();
        }

        System.out.println("Maximum sum = " + maxSum);
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};
        maxSubArraySum(numbers);
    }
}

//Time Complexity = O(n^3)
//Space Complexity = O(1)

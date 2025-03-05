package Arrays.MaxSubArraySum;

public class MaxSubArraySumWithPrefix {
    public static void maxSubArraySum(int arr[]){
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];

        prefix[0] = arr[0];
        //calculate prefix array
        for(int i = 1; i < prefix.length; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }

        //calculate maxSum
        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr.length; j++){
                int currSum = i == 0 ? prefix[j] : prefix[j] - prefix[i-1];

                if(currSum > maxSum){
                    maxSum = currSum;
                }
            }
        }

        System.out.println("Maximum sum = " + maxSum);
    }
    public static void main(String[] args) {
        int numbers[] = {1,-2,6,-1,3};
        maxSubArraySum(numbers);
    }
}

//Time Complexity = O(n^2)
//Space Complexity = O(n)

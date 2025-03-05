package Arrays;

public class PrintSubArray {

    public static void printSubArray(int numbers[]){
        int totalSubArrays = 0;
        int subArraySum = 0, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for(int i = 0; i < numbers.length; i++){
            for(int j = i; j < numbers.length; j++){
                subArraySum = 0;
                for(int k = i; k <= j; k++){
                    System.out.print(numbers[k] + " ");
                    subArraySum += numbers[k];
                }

                totalSubArrays++;
                System.out.println();
                // System.out.println("Sum of subarray = " + subArraySum);

                if(subArraySum < min){
                    min = subArraySum;
                }

                if(subArraySum > max){
                    max = subArraySum;
                }
            }
            System.out.println();
        }

        System.out.println("Total number of subarrays = " + totalSubArrays);
        System.out.println("Minimum sum of subarray = " + min);
        System.out.println("Maximum sum of subarray = " + max);
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};
        printSubArray(numbers);
    }
}

//Time Complexity = O(n^3)
//Space Complexity = O(1)

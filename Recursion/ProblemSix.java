// Q6: Check if an array is sorted or not

package Recursion;

public class ProblemSix {
    public static boolean printArr(int[] arr, int i){
        if(i == arr.length-1){
            return true;
        }

        if(arr[i] > arr[i+1]){
            return false;
        }

        return printArr(arr, i+1);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,4};
        int i = 0;
        if(printArr(arr, i)){
            System.out.println("Sorted");
        }
        else{
            System.out.println("Not Sorted");
        }
    }
}

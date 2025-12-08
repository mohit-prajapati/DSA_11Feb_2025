// Q8: WAF to find the last occurence of an element in an array

package Recursion;

public class ProblemEight {
    public static int lastOccurence(int[] arr, int key, int i){
        if (i == arr.length) {
            return -1;
        }

        int isFound = lastOccurence(arr, key, i+1);
        if (arr[i] == key && isFound == -1) {
            return i;
        }

        return isFound;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 2, 4, 5};
        System.out.println(lastOccurence(arr, 4, 0));
    }
}

package Arrays;

public class BinarySearch {

    public static int binarySearch(int numbers[], int key){
        int start = 0, end = numbers.length - 1; // getting the start & end index

        while(start <= end){
            int mid = (start + end) / 2; // finding the middle element
            if (numbers[mid] == key) { // found
                return mid;
            }

            if(numbers[mid] < key) { // right part
                start = mid + 1;
            } else { // left part
                end = mid - 1;
            }

        }
        return -1; // key not found
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10,12,14};
        int key = 10;
        System.out.println("Index for key is: " + binarySearch(numbers, key));
    }
}


// Note: Binary Search is used to find the position of a target value within a sorted array.
// It works by repeatedly dividing the search interval in half until the target value is found or the interval is empty.

//Time Complexity = O(log2 n)
//Space Complexity = O(1)


package DivideAndConquer;

public class SearchInRotatedSortedArray {
    public static int search(int arr[], int target, int startIdx, int endIdx) {
        // base case
        if (startIdx > endIdx) {
            return -1;
        }
        // work
        int mid = startIdx + (endIdx - startIdx) / 2; // (startIdx+endIdx)/2

        // Case found
        if (arr[mid] == target) {
            return mid;
        }

        // mid on L1
        if (arr[startIdx] <= arr[mid]) {
            // case a : left
            if (arr[startIdx] <= target && target <= arr[mid]) {
                return search(arr, target, startIdx, mid - 1);
            } else { // case b : right
                return search(arr, target, mid + 1, endIdx);
            }
        } else { // mid on L2
            // case c : right
            if (arr[mid] <= target && target <= arr[endIdx]) {
                return search(arr, target, mid + 1, endIdx);
            } else { // case d : left
                return search(arr, target, startIdx, mid - 1);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 0; // output : 4
        int tarIdx = search(arr, target, 0, arr.length - 1);
        System.out.println("Target is at index: " + tarIdx);
    }
}

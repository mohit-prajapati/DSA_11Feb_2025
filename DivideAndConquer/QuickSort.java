package DivideAndConquer;

public class QuickSort {

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int partition(int arr[], int start, int end) {
        int pivot = arr[end];
        int i = start - 1; // to make place for element smaller then pivot
        for (int j = start; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;
                // swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        i++;
        // swap for pivot element
        int temp = pivot;
        arr[end] = arr[i];
        arr[i] = temp;
        return i;
    }

    public static void quickSort(int arr[], int startIndex, int endIndex) {
        // base case
        if (startIndex >= endIndex) {
            return;
        }
        // last element as pivot
        int pIdx = partition(arr, startIndex, endIndex);
        quickSort(arr, startIndex, pIdx - 1); // left part
        quickSort(arr, pIdx + 1, endIndex); // right part
    }

    public static void main(String[] args) {
        int arr[] = { 6, 3, 9, 8, 2, 5 };
        quickSort(arr, 0, arr.length - 1);
        printArray(arr);
    }
}

package DivideAndConquer;

public class mergeSort {
    public static void mergeSort(int[] arr, int start, int end) {
        // base case
        if (start >= end) {
            return;
        }

        int mid = start + (end - start) / 2; // calculate middile index
        mergeSort(arr, start, mid); // left part
        mergeSort(arr, mid + 1, end); // right part

        merge(arr, start, mid, end);
    }

    public static void merge(int[] arr, int start, int mid, int end) {
        int[] temp = new int[end - start + 1];
        int i = start; // for left part
        int j = mid + 1; // for right part
        int k = 0;

        while (i <= mid && j <= end) {
            if (arr[i] <= arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        // left part
        while (i <= mid) {
            temp[k] = arr[i];
            i++;
            k++;
        }

        // right part
        while (j <= end) {
            temp[k] = arr[j];
            j++;
            k++;
        }

        // copy temp into original array
        for (int l = 0; l < temp.length; l++) {
            arr[start + l] = temp[l];
        }
    }

    public static void main(String[] args) {
        int[] arr = { 6, 3, 9, 5, 2, 8 };
        mergeSort(arr, 0, arr.length - 1);
        printArr(arr);
    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

package DivideAndConquer.PracticeQuestions;

public class Question1 {
    // Q: Applay merget sort to sort any arrya of String. (Assume that all the
    // characters in all the String are in lowercase), (EASE)

    public static void merge(String arr[], int startIdx, int mid, int endIdx) {
        String[] temp = new String[endIdx - startIdx + 1];
        int i = startIdx; // for left part
        int j = mid + 1; // for right part
        int k = 0; // for temp array

        while (i <= mid && j <= endIdx) {
            if (arr[i].compareTo(arr[j]) <= 0) {
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
        while (j <= endIdx) {
            temp[k] = arr[j];
            j++;
            k++;
        }

        // copy temp to original array
        for (int l = 0; l < temp.length; l++) {
            arr[startIdx + l] = temp[l];
        }
    }

    public static void mergeSort(String arr[], int startIdx, int endIdx) {
        // base case
        if (startIdx >= endIdx) {
            return;
        }

        // work
        int mid = startIdx + (endIdx - startIdx) / 2; // calculate mid
        // left part
        mergeSort(arr, startIdx, mid);
        // right part
        mergeSort(arr, mid + 1, endIdx);

        // merge
        merge(arr, startIdx, mid, endIdx);
    }

    public static void main(String[] args) {
        String arr[] = { "sun", "earth", "mars", "mercury" };
        mergeSort(arr, 0, arr.length - 1);
        printArray(arr);
    }

    public static void printArray(String arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

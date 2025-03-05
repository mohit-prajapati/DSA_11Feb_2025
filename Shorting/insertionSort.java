package Shorting;

public class insertionSort {

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int prev = i-1;
            // finding out the corrent possion to insert
            while(prev >= 0 && arr[prev] > current) {
                arr[prev+1] = arr[prev];
                prev--;
            }

            // insertion
            arr[prev+1] = current;
        }
    }
    public static void main(String[] args) {
        int[] arr = {5, 4, 1, 3, 2};
        insertionSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

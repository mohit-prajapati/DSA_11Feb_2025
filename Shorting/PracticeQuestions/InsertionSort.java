package Shorting.PracticeQuestions;

public class InsertionSort {

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int prev = i-1;

            // finding out the corrent possion to insert
            while(prev >= 0 && arr[prev] < current) {
                arr[prev+1] = arr[prev];
                prev--;
            }
            
            // insertion
            arr[prev+1] = current;
        }
    }
    public static void main(String[] args) {
        int[] arr = {3,6,2,1,8,7,4,5,9};
        insertionSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

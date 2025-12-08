package Recursion.Practic_questions;

public class question1 {
//    Q.1:  ForagivenintegerarrayofsizeN.Youhavetofindalltheoccurrences(indices)ofagivenelement(Key)andprintthem.Usearecursivefunctiontosolvethisproblem.
// Sample Input: arr[ ] = {3, 2, 4, 5, 6, 2, 7, 2, 2},
// key = 2Sample Output: 1 5 7 8

    public static void findOccurrences(int arr[], int key, int i)
    {
        if(i == arr.length){
            return;
        }

        if(arr[i] == key){
            System.out.print(i + " ");
        }

        findOccurrences(arr, key, i+1);
    }

   public static void main(String[] args) {
    int arr[] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
    int key = 2;
    findOccurrences(arr, key, 0);
   }
}

package Arrays;
import java.util.*;

public class LargestNumber {
    public static int getLargest(int numbers[]) {
        int largest = Integer.MIN_VALUE; //-infinity
        int smallest = Integer.MAX_VALUE; //+infinity

        for(int i = 0; i < numbers.length; i++)
        {
            if(numbers[i] > largest) {
                largest = numbers[i];
            }

            if(numbers[i] < smallest){
                smallest = numbers[i];
            }
        }

        System.out.println("Smallest number is: " + smallest);

        return largest;
    }
    public static void main(String[] args) {
        int largest[] = {1,2,6,3,6};

        System.out.println("Largest number is: " + getLargest(largest));
    }
}

//Time Complexity = O(n)
//Space Complexity = O(1)

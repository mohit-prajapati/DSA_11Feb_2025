package Arrays.ArrayAssignment;

import java.util.*;

public class Question1 {
    public static boolean checkIfDuplicate(int numbers[]){
        int count[] = new int[numbers.length];
        for(int i = 0; i < numbers.length; i++) {
            for(int j = i+1; j < numbers.length; j++){
                if(numbers[i] == numbers[j]){
                    return true;
                }
            }
        }

        return false;
    }

    // Approach 2: Using HashMap
    public static boolean checkIfDuplicate2(int numbers[]) {
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < numbers.length; i++){
            if(set.contains(numbers[i])){
                return true;
            }else{
                set.add(numbers[i]);
            }
        }

        return false;
    }
    public static void main(String[] args) {
        int numbers[] = {1,2,3,4};
        System.out.println(checkIfDuplicate2(numbers));
    }
}

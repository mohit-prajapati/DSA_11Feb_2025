package Recursion.Practic_questions;

public class question3 {
    // Q.3: Write a program to findLength of aStringusing Recursion

    public static int findLength(String str)
    {
        if(str.length() == 0){
            return 0;
        }

        return findLength(str.substring(1)) + 1;
    }
    public static void main(String[] args) {
        String str = "Hellowerty4567";
        System.out.println(findLength(str));
    }
}

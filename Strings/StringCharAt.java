package Strings;

public class StringCharAt {

    public static void printLetters(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // concatenation
        String firstName = "Mohit";
        String lastName = "Prajapati";

        String fullName = firstName + " " + lastName;

        printLetters(fullName);
    }
}
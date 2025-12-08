// 

public class Question5 {
    public static void countWays(int n, String source, String helper, String destination) {
        if (n == 1) {
            System.out.println(" Transfer disk " + n + " from " + source + " to " + destination);
            return;
        }

        countWays(n - 1, source, destination, helper);

        System.out.println(" Transfer disk " + n + " from " + source + " to " + destination);

        countWays(n - 1, helper, source, destination);
    }

    public static void main(String[] args) {
        int n = 3;

        countWays(n, "A", "B", "C");
    }
}

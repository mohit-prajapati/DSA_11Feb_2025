public class birthdayCake {

    public static int birthdayCakeCandles(int[] candles) {
        int max = candles[0];
        int count = 1;

        for (int i = 1; i < candles.length; i++) {
            if (candles[i] > max) {
                max = candles[i];
                count = 1;
            } else if (candles[i] == max) {
                count++;
            }
        }

        return count;
    }
    public static void main(String[] args) {
        int[] candles = {3, 2, 1, 3};

        System.out.print(birthdayCakeCandles(candles));
    }
}

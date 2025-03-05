package Arrays.ArrayAssignment;

public class Question3 {

    public static int maxProfit(int[] prices)
    {
        int maxProfit = 0, buyPrice = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if (buyPrice < prices[i]) {
                // int profit = prices[i] - buyPrice;
                // maxProfit = Math.max(maxProfit, profit);

                maxProfit = Math.max(prices[i] - buyPrice, maxProfit);
            }else{
                buyPrice = prices[i];
            }
        }

        return maxProfit;
    }
    public static void main(String[] args) {
        int prices[] = {7, 6, 4,  3, 1};
        System.out.println("The maximum profit is " + maxProfit(prices));
    }
}

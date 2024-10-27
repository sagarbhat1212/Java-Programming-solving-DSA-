public class stockanalysis {
    public static int buyAndSellStocks(int prices[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (buyPrice > prices[i]) {
                buyPrice = prices[i];
            }
            int profit = prices[i] - buyPrice;
            maxProfit = Math.max(profit, maxProfit);
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4}; // Define the prices array
        int maxProfit = buyAndSellStocks(prices); // Call the method and store the result
        System.out.println("Maximum Profit: " + maxProfit); // Output the result
    }
}
// Output is ' Maximum Profit: 5 '



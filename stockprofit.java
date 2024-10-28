public class stockprofit {
    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                int profit = prices[j] - prices[i];
                maxProfit = Math.max(profit, maxProfit);
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4}; // Define the prices array
        int maxProfit = maxProfit(prices); // Call the method and store the result
        System.out.println("Maximum Profit: " + maxProfit); // Output the result
        
    }
    
}
// Output is  Maximum Profit: 5 

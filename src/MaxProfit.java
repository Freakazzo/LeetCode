public class MaxProfit {
    public int maxProfit(int[] prices) {
        int maxP = 0;
        int minVal = Integer.MAX_VALUE;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minVal) {
                minVal = prices[i];
            } else if (prices[i] - minVal > maxP) {
                maxP = prices[i] - minVal;
            }
        }
        return maxP;
    }
}
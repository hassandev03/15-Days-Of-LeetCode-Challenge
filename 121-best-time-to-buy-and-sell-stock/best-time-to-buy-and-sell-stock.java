class Solution {
    public int maxProfit(int[] prices) {
        int buyPrice = prices[0], profit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < buyPrice)
                buyPrice = prices[i];
            else if ((prices[i] - buyPrice) > profit)
                profit = prices[i] - buyPrice;
        }
        return profit;
    }
}
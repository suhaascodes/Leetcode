class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int lowest = Integer.MAX_VALUE;
        int maxProfit = Integer.MIN_VALUE;
        for (int i=0; i<n; i++) {
            lowest = Math.min(lowest, prices[i]);
            maxProfit = Math.max(maxProfit, prices[i] - lowest);
        }
        return maxProfit;
    }
}
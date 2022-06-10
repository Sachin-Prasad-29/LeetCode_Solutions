class Solution {
    public int maxProfit(int[] prices) {
       int minSoFar=prices[0];
       int maxProfit = 0;
        for (int i = 0;i<prices.length;i++){
            minSoFar = Math.min(minSoFar,prices[i]);
            maxProfit = Math.max(maxProfit,prices[i] - minSoFar);
        }
        return maxProfit;
    }
}
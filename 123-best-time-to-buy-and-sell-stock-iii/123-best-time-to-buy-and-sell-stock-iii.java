class Solution {
    public int maxProfit(int[] a) {
         int[][][] dp = new int[a.length][2][3];
         for(int[][] d : dp)
             for(int[] t: d)
                Arrays.fill(t,-1);
         return getMaxProfit(0,1,a,dp,2);
     }
    private static int getMaxProfit(int i , int canBuy, int[] a,int[][][] dp,int cap){
        if(cap == 0 ) return 0;
        if(i == a.length){
            return 0;
        }
        if(dp[i][canBuy][cap] != -1) return dp[i][canBuy][cap];
        int profit = 0;
        if(canBuy == 1){
            // if we have allowed to buy the stock we can either buy this day or not buy
            profit = Math.max(-a[i] + getMaxProfit(i+1,0,a,dp,cap),getMaxProfit(i+1,1,a,dp,cap));
        }
        else{
            profit = Math.max(a[i] + getMaxProfit(i+1,1,a,dp,cap-1) , getMaxProfit(i+1,0,a,dp,cap));
        }
        return dp[i][canBuy][cap] =profit;
    }
}
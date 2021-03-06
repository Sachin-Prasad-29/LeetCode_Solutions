class Solution {
    public int maxProfit(int[] a) {
        int[][] dp = new int[a.length+1][2];
        dp[a.length][0] = 0;
        dp[a.length][1] = 0;
        int aheadNotBuy = 0;
        int aheadBuy = 0;
        
        
        
        for(int i = a.length-1; i >= 0 ; i--){
            int currNotBuy = 0 ; 
            int currBuy = 0;
            for(int j = 1; j >= 0; j--){
               if(j == 1){
                   currBuy = Math.max(-a[i] + aheadNotBuy ,aheadBuy);
                }else{
                    currNotBuy = Math.max(a[i] + aheadBuy ,aheadNotBuy);                   
                }
            }
            aheadBuy = currBuy;
            aheadNotBuy = currNotBuy;
        }
        return aheadBuy;
    }
    
    
     public int max1Profit(int[] a) {
         int[][] dp = new int[a.length][2];
         for(int[] d : dp)
             Arrays.fill(d,-1);
         return getMaxProfit(0,1,a,dp);
     }
    private static int getMaxProfit(int i , int canBuy, int[] a,int[][] dp){
        if(i == a.length){
            return 0;
        }
        if(dp[i][canBuy] != -1) return dp[i][canBuy];
        int profit = 0;
        if(canBuy == 1){
            // if we have allowed to buy the stock we can either buy this day or not buy
            profit = Math.max(-a[i] + getMaxProfit(i+1,0,a,dp),getMaxProfit(i+1,1,a,dp));
        }
        else{
            profit = Math.max(a[i] + getMaxProfit(i+1,1,a,dp) , getMaxProfit(i+1,0,a,dp));
        }
        return dp[i][canBuy]=profit;
    }
    

    
    
    
    
    public int maxProfit1(int[] a) {
       int  profit = 0 ; 
        int n = a.length;
        for(int i = 1 ; i < n ; i++){
            if(a[i] > a[i-1]){
                profit += a[i]- a[i-1];
            }
        }
        return profit;
    }
}
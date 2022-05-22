class Solution {
    public int coinChange(int[] coins, int A) {
        int N = coins.length;
        int[][] dp = new int[N+1][A+1];
        
        // Initilization Part
        for(int i = 0 ; i < A+1; i++)
             dp[0][i] = Integer.MAX_VALUE - 1;
        for(int i = 1; i < N+1; i++)
             dp[i][0] = 0;
        // Extra INitilization
        for(int i = 1; i < A+1;i++){
                if(i%coins[0] ==0 ) dp[1][i] = i/coins[0];
                else dp[1][i] = Integer.MAX_VALUE - 1;
        }
        
        // Iterzation process
        for(int i =2; i< N+1; i++){
            for(int j = 1; j< A+1; j++){
                if(coins[i-1] <= j)
                     dp[i][j] = Math.min(1+dp[i][j-coins[i-1]], dp[i-1][j]);
                else
                    dp[i][j] = dp[i-1][j];
            }
        }
        if(dp[N][A] >= Integer.MAX_VALUE-1) return -1;
        return dp[N][A];
            
    }
}
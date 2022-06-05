class Solution {
    static int[] dp ;
    public int climbStairs(int n) {
    dp = new int[n+1];
    dp[0] = 1;
        dp[1] = 1;
    for(int i = 2; i<= n;i++){
        dp[i] = dp[i-1]+dp[i-2];
    }
        return dp[n];
        
        
        
    //     return helper(n);
    // }
    // int helper(int n){
    //     if(n == 0 || n== 1) return 1;
    //     if( dp[n] != -1) return dp[n];
    //     int L = helper(n-1);
    //     int R = helper(n-2);
    //     return dp[n] = L+R;
       
    }
}
class Solution {
    static int[] dp ;
    public int climbStairs(int n) {
        dp = new int[n+1];
        Arrays.fill(dp,-1);
        return helper(n);
    }
    int helper(int n){
        if(n == 0 || n== 1) return 1;
        if( dp[n] != -1) return dp[n];
        int L = helper(n-1);
        int R = helper(n-2);
        return dp[n] = L+R;
       
    }
}
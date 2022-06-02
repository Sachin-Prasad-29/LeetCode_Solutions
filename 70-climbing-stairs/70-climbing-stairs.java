class Solution {
    // Array to memoize the solution 
    static int[] dp ;
    public int climbStairs(int n) {
        // creating ans initilizing the array 
        dp = new int[n+1];
        Arrays.fill(dp,-1);
        // calling the helper function
        return helper(n);
    }
    private static int helper(int n){
        // base conditions
        if(n == 0 ) return 1;
        if(n == 1) return 1;
        
        // check if we already solved it previously 
        if(dp[n] != -1) return dp[n];
        
        // store the answer in dp array to avoid it solving again and again
        return dp[n] = helper(n-1) + helper(n-2);
        
    }
}
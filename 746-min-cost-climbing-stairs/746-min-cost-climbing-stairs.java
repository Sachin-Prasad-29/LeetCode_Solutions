class Solution {
    static int[] dp ;
    public int minCostClimbingStairs(int[] cost) {
        int N = cost.length;
        dp = new int[N+1];
        Arrays.fill(dp,-1);
        return Math.min(helper(N-1,cost),helper(N-2,cost));
    }
    private static int helper(int N , int[] cost){
        if(N == 0 || N== 1) return cost[N];
        if(dp[N] != -1 ) return dp[N];
        int oneStep = helper(N-1,cost);
        int twoStep = helper(N-2,cost);
        
        return dp[N]=cost[N]+Math.min(oneStep,twoStep);
    }
}
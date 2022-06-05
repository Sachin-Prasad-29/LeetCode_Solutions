class Solution {
//     // Recursive Approach 
//     public int minCostClimbingStairs(int[] cost) {
//         int N = cost.length;
//         return Math.min(helper(N-1,cost),helper(N-2,cost));
//     }
//     private static int helper(int N , int[] cost){
//         if(N == 0 || N== 1) return cost[N];
//         int oneStep = helper(N-1,cost);
//         int twoStep = helper(N-2,cost);
        
//         return cost[N]+Math.min(oneStep,twoStep);
//     }
    
//     // Memoization approach
//     static int[] dp ;
//     public int minCostClimbingStairs(int[] cost) {
//         int N = cost.length;
//         dp = new int[N+1];
//         Arrays.fill(dp,-1);
//         return Math.min(helper(N-1,cost),helper(N-2,cost));
//     }
//     private static int helper(int N , int[] cost){
//         if(N == 0 || N== 1) return cost[N];
//         if(dp[N] != -1 ) return dp[N];
//         int oneStep = helper(N-1,cost);
//         int twoStep = helper(N-2,cost);
        
//         return dp[N]=cost[N]+Math.min(oneStep,twoStep);
//     }
    
    // Buttom up Appraoch 
    public int minCostClimbingStairs(int[] cost){
            int N = cost.length;
            int[] dp = new int[N+1];
            dp[0] = cost[0];
            dp[1] = cost[1];
            for(int i = 2 ; i < N; i++){
                dp[i] = Math.min(dp[i-1],dp[i-2])+cost[i];
            }
        return Math.min(dp[N-1],dp[N-2]);
    }
}





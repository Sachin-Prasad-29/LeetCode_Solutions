class Solution {
    int[][][] dp;
    int MAX = 1000001;
    int minCost(int[] houses, int[][] cost, int m, int n, int target) {
        dp = new int[m+1][target+1][n+1];
        int res = dfs(houses, cost, 0, target, 0);
        System.out.println(res);
        return res == MAX ? -1 : res;
    }
    
    int dfs(int[] houses, int[][] cost, int i, int target, int lastColor) {
        if (i >= houses.length || target < 0) return target == 0 ? target : MAX;
        if (dp[i][target][lastColor] > 0) return dp[i][target][lastColor];
        
        // painted last year.
        if (houses[i] != 0) return dfs(houses, cost, i + 1, target - ((lastColor != houses[i]) ? 1 : 0), houses[i]);      
        
        int res = MAX;
        for (int clr = 1; clr <= cost[i].length; ++clr) {
            res = Math.min(res, cost[i][clr - 1] + dfs(houses, cost, i + 1, target - ((lastColor != clr) ? 1 : 0), clr));
        }            
        
        return dp[i][target][lastColor] = res;
    }
}
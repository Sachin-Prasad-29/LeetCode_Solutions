class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int m = triangle.size();
        int[][] dp = new int[m+1][m+1];
        for(int[] d:dp) Arrays.fill(d,-1);
       return solve(0,0,triangle,dp);
    }
    private static int solve(int m, int n , List<List<Integer>> tri,int[][] dp){
        if(m == tri.size()-1)
            return tri.get(m).get(n);
        if(dp[m][n] != -1) return dp[m][n];
        int down = tri.get(m).get(n) + solve(m+1,n,tri,dp);
        int dia = tri.get(m).get(n) + solve(m+1,n+1,tri,dp);
        return dp[m][n]=Math.min(down,dia);
    }
}
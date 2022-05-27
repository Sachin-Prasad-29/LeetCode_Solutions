class Solution {
    public boolean isSubsequence(String s, String t) {
        int M = s.length();
        int N = t.length();
        
        int[][] dp = new int[M+1][N+1];
        for(int[] d : dp)
            Arrays.fill(d,-1);
        
        if(M ==helper(s,t,M,N,dp)) return true;
        return false;
    }
    private static int helper(String s, String t, int i , int j,int[][] dp){
        if(i == 0 || j == 0){
            return 0;
        }
        if(dp[i][j] != -1) return dp[i][j];
        if(s.charAt(i-1) == t.charAt(j-1)){
            dp[i][j] =1+helper(s,t,i-1,j-1,dp);
            return dp[i][j];
        }
        else {
            dp[i][j] = helper(s,t,i,j-1,dp);
            return dp[i][j];
        }
            
    }
}
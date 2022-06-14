class Solution {
     public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        
        int[][] dp = new int[m+1][n+1];
        // as java already contain 0 as default value no need to initailize the dp array
        for(int i = 1 ; i < m+1 ;i++){
            for(int j = 1 ; j < n+1 ; j++){
                if(word1.charAt(i-1) == word2.charAt(j-1))
                     dp[i][j] = 1+dp[i-1][j-1];
                 
                 else
                     dp[i][j] = Math.max(dp[i-1][j] , dp[i][j-1]);       
            }
        }
         return m+n-(2*dp[m][n]);
     }
    
    public int minDistsance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        int[][] dp = new int[m+1][n+1];
        for(int[] d: dp) Arrays.fill(d,-1);
        
        int lcs = LCS(word1,word2,m,n,dp);
        
        return m+n-(2*lcs);
    }
    private static int LCS(String s1,String s2,int m,int n,int[][] dp){
        if(n==0 || m==0) return 0;
        if(dp[m][n] != -1) return dp[m][n];
        if(s1.charAt(m-1) == s2.charAt(n-1)){
            return dp[m][n] = 1+LCS(s1,s2,m-1,n-1,dp);
        }
        else
            return dp[m][n] = Math.max(LCS(s1,s2,m-1,n,dp),LCS(s1,s2,m,n-1,dp));
    }
}
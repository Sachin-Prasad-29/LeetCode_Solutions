class Solution {
    // Buttom up (tabuluation approach)
     public int uniquePaths(int m, int n) {
         int[] dp = new int[m];
         int[] temp = new int[n];
         for(int i= 0; i < m; i++ ){
             for(int j = 0; j < n; j++ ){
                 if(i == 0 && j == 0) temp[j]= 1;
                 else{
                     int left = 0, up = 0;
                     if(j > 0) left = temp[j-1];
                     if(i > 0) up  = dp[j];
                     temp[j] = up+left;
                 }
              }
             dp = temp;
         }
         
         return temp[n-1];
     }
    // Buttom up (tabuluation approach)
     public int uniquePatsdhs(int m, int n) {
         int[][] dp = new int[m][n];
         dp[0][0] = 1;
         for(int i= 0; i < m; i++ )
             for(int j = 0; j < n; j++ ){
                 if(i == 0 && j == 0) dp[i][j]= 1;
                 else{
                     int left = 0, up = 0;
                     if(j > 0) left = dp[i][j-1];
                     if(i > 0) up  = dp[i-1][j];
                     dp[i][j] = up+left;
                 }
              }
         
         return dp[m-1][n-1];
     }
}
    
    // Mempization dp 
//     static int[][] dp;
//     public int uniquePaths(int m, int n) {
//         dp = new int[m][n];
//         for(int[] d:dp)
//             Arrays.fill(d,-1);
//         return helper(m-1,n-1);
//     }
//     private static int helper(int m, int n){
//         if(m == 0 && n == 0 )
//             return 1;
//         if(m < 0 || n < 0 ) return 0;
//         if(dp[m][n] != -1) return dp[m][n];
        
//         int top = helper(m-1,n);
//         int left = helper(m,n-1);
        
//         return dp[m][n]=top +left;
//     }
// }
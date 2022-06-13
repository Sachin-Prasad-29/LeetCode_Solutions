class Solution {
     public int minimumTotal(List<List<Integer>> triangle) {
        int m = triangle.size();
        int[] dp = new int[m];
        // initialize the dp array
        for(int j = m-1; j>=0;j--)
            dp[j] = triangle.get(m-1).get(j);
        
        // iterative for loops
        
        for(int i = m-2; i >= 0 ;i--){
            int[] temp = new int[m];
            for(int j = i; j >= 0 ; j--){
                int down = triangle.get(i).get(j) + dp[j];
                int dia = triangle.get(i).get(j) + dp[j+1];
                temp[j]= Math.min(down,dia);
            }
            dp=temp;
            
        }
         return dp[0];
        
    }
    
    public int minivmumTotal(List<List<Integer>> triangle) {
        int m = triangle.size();
        int[][] dp = new int[m][m];
        // initialize the dp array
        for(int j = m-1; j>=0;j--)
            dp[m-1][j] = triangle.get(m-1).get(j);
        
        // iterative for loops
        
        for(int i = m-2; i >= 0 ;i--){
            for(int j = i; j >= 0 ; j--){
                int down = triangle.get(i).get(j) + dp[i+1][j];
                int dia = triangle.get(i).get(j) + dp[i+1][j+1];
                dp[i][j]= Math.min(down,dia);
            }
        }
         return dp[0][0];
        
    }

    
    
    
    
    public int minimugfgmTotal(List<List<Integer>> triangle) {
        int m = triangle.size();
        int[][] dp = new int[m][m];
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
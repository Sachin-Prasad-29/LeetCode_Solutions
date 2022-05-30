class Solution {
    static int[][] dp;
    public int minCut(String s) {
       
        int N = s.length();
         dp = new int[N+1][N+1];
         for(int[] d: dp)
             Arrays.fill(d,-1);
        
        return Partition(s,0,N-1);
    }
    private static int Partition(String s, int start ,int end){
        if(start >= end) return 0;
        if(isPalindrone(s,start,end)) return dp[start][end]= 0;
        if(dp[start][end] != -1) return dp[start][end];
        
        int P = Integer.MAX_VALUE;
        
        for(int k = start; k < end; k++ ){
            if(isPalindrone(s,start,k)){
            int right;
           
            if(dp[k+1][end] !=-1) 
                right = dp[k+1][end];
            else
                right = Partition(s,k+1,end);
            
            int temp = right+1;
            
            P = Math.min(temp, P);
            }
            
        }
        dp[start][end] = P;
        return P;
    }
    private static boolean isPalindrone(String s, int i, int j){
       while(i <= j){
           if(s.charAt(i) != s.charAt(j))
                return false;
           i++;
           j--; 
       }
        return true;
    }
}
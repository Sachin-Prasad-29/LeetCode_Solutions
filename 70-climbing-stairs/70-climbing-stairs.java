class Solution {
    static int[] dp ;
    public int climbStairs(int n) {
    int prev =1;
    int prev2 = 1;
        
    for(int i = 2; i<= n;i++){
        int curr = prev+prev2;
        prev2 = prev;
        prev = curr;
    }
        return prev;
        
        
        
    //     return helper(n);
    // }
    // int helper(int n){
    //     if(n == 0 || n== 1) return 1;
    //     if( dp[n] != -1) return dp[n];
    //     int L = helper(n-1);
    //     int R = helper(n-2);
    //     return dp[n] = L+R;
       
    }
}
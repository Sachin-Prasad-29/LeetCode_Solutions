class Solution {
    static int[][] dp ;
    public int rob(int[] nums) {
        int n = nums.length;
        
        if(n == 1) return nums[0];
        dp = new int[n+1][2];
        for(int[] d: dp)
            Arrays.fill(d,-1);
       return Math.max(helper(nums,n-1,true),Math.max(helper(nums,n-3,false),helper(nums,n-2,false))); 
    }
    private static int helper(int[] nums, int n , boolean flag){
        if(n < 0) return 0;
        if(n == 0 && flag== true) return 0;
        if(n == 0 || n == 1 ) return nums[n];
        int p = flag ? 1:0;
        if(dp[n][p] != -1) return dp[n][p];
        int ans = nums[n] + Math.max(helper(nums,n-2,flag),helper(nums,n-3,flag));
         
        return dp[n][p] =ans;
        
    }
}
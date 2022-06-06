class Solution {
    static int[] dp;
    public int rob(int[] nums) {
        int n = nums.length;
        dp = new int[n+1];
        Arrays.fill(dp,-1);
        return Math.max(helper(nums,n-1),helper(nums,n-2));
    }
    private static int helper(int[] nums, int n){
        if(n < 0) return 0;
        if(dp[n] != -1) return dp[n];
        if( n == 0 || n == 1) return nums[n];
        int ans = nums[n]+ Math.max(helper(nums,n-2),helper(nums,n-3));
        return dp[n]=ans;
    }
}
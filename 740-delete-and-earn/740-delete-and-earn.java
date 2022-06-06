class Solution {
    static int[] dp;
    public int deleteAndEarn(int[] nums) {
        int n = nums.length;
        // int max = nums[0];
        // for( int i = 0 ; i < n ; i++){
        //     max = Math.max(max,nums[i]);
        // }
        //System.out.println(max);
        int[] sum = new int[10001];
        for(int i = 0 ; i < n ;i++){
                sum[nums[i]] +=nums[i];
        }
        dp = new int[10002];
        Arrays.fill(dp,-1);
       // System.out.println(Arrays.toString(sum));
        
        
        return Math.max(helper(sum,10000),helper(sum,9999));
    }
    private static int helper(int[] sum,int n){
        if(n<=0) return 0;
        if(n==1) return sum[n];
        if(dp[n] != -1) return dp[n];
        int ans = sum[n] + Math.max(helper(sum,n-2),helper(sum,n-3));
        return dp[n]=ans;
    }
}
class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int sum = 0;
        int N = nums.length;
        for(int i : nums)
             sum+=i;
        int[][] dp = new int[25][2010];
        for(int[] arr : dp) 
            Arrays.fill(arr,-1);
        return findcount(0,0,nums,target,dp);
    }
    private static int findcount(int index, int sum ,int[] nums, int target, int[][] dp){
        if(index == nums.length){
            if(sum == target) return 1;
            else return 0;
        }
        if(dp[index][1000+sum] != -1) return dp[index][1000+sum];
        
        dp[index][1000+sum] = (findcount(index +1, sum + nums[index],nums,target,dp)+findcount(index+1,sum - nums[index],nums,target,dp));
        return dp[index][1000+sum];
    }
}
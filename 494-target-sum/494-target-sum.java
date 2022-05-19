class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int R= dfs(1,nums,target,nums[0]);
        int L = dfs(1, nums,target,-nums[0]);
        return R+L;
    }
    
    private static int dfs(int index, int[] nums, int target, int sum){
        if(index == nums.length){
            if(sum == target)
                return 1;
            else 
                return 0;
        }
        int R = dfs(index+1, nums, target, sum+nums[index]);
        int L = dfs(index+1, nums, target, sum-nums[index]);
        
        return R+L;
    }
}
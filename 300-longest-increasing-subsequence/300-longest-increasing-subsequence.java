class Solution {
    //Dp memoization + recursion
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[][] dp = new int[n][n+1];
        for(int[] d:dp)
            Arrays.fill(d,-1);
        return getLIS(0,-1,nums,dp);      
    }
    private static int getLIS(int index, int prev_ind, int[] nums,int[][] dp){
        //base case
        if(index == nums.length){
            return 0;
        }
        if(dp[index][prev_ind+1] != -1) return dp[index][prev_ind+1];
        int length = 0 + getLIS(index+1,prev_ind,nums,dp);
        
        if(prev_ind == -1 || nums[prev_ind] < nums[index])
            length = Math.max( length, 1+ getLIS( index+1,index,nums,dp));
        
        return dp[index][prev_ind+1]=length;
    }
    
    
    
    
    
//     // recursive solution gives TLE
//     public int lengthfOfLIS(int[] nums) {
//         return getfLIS(0,-1,nums);      
//     }
//     private static int getfLIS(int index, int prev_ind, int[] nums){
//         //base case
//         if(index == nums.length){
//             return 0;
//         }
//         int length = 0 + getLIS(index+1,prev_ind,nums);
        
//         if(prev_ind == -1 || nums[prev_ind] < nums[index])
//             length = Math.max( length, 1+ getLIS( index+1,index,nums ));
        
//         return length;
//     }
 }
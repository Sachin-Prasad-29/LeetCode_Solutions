class Solution {
    public int minMoves2(int[] nums) {
        long result = Integer.MAX_VALUE;
        for(int i = 0 ; i < nums.length;i++){
                long tempResult = 0;
            for( int j = 0 ; j < nums.length; j++){
                tempResult += (Math.abs(nums[i]-nums[j]));
            }
            result = Math.min(result, tempResult);
        }
        return (int)result;
    }
}
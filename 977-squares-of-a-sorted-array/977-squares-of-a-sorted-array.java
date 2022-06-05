class Solution {
    public int[] sortedSquares(int[] nums) {
        int N = nums.length;
        for(int i = 0 ; i < N; i++){
            nums[i] = (int)Math.pow(nums[i],2);
        }   
        Arrays.sort(nums);
        return nums;
    }
}
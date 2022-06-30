class Solution {
    public int minMoves2(int[] nums) {
        int i = 0 ; 
        int j = nums.length-1;
        int result = 0 ; 
        Arrays.sort(nums);
        while(i < j){
            result += nums[j] - nums[i];
            j--;
            i++;
        }
        return result;
    }
}
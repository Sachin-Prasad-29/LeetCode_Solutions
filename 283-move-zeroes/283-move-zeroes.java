class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int pointer = 0 ;
        for(int i = 0 ; i < n; i++){
            if(nums[i] != 0)
               nums[pointer++] = nums[i];
        }
        while(pointer < n){
            nums[pointer++] = 0;
        }
    }
}
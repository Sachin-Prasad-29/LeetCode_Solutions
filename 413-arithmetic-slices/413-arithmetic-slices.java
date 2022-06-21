class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int n = nums.length;
        if(n < 3) return 0;
        int count = 0;
        for(int i = 0 ; i < n-2 ; i++){
            int start = i+1;
            int end = i+2;
            int diff = nums[i+1] - nums[i];
            while(end < n ){
                if(nums[end] - nums[start] == diff){
                    count++;
                    end++;
                    start++;
                }else
                    break;
            }
        }
        return count;
        
    }
}
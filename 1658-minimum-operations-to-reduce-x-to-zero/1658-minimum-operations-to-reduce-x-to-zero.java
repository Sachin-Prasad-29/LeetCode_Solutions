class Solution {
    public int minOperations(int[] nums, int x) {
        int totalSum = 0 ; 
        for(int a: nums)
            totalSum += a;
        if( totalSum < x) return -1;
        int target = totalSum -x;
        int n = nums.length;
        int i=0,j=0,sum=0;
        int maxLen = Integer.MIN_VALUE;
        while(j < n){
            sum += nums[j];
            
            if( sum > target){
                while(sum > target){
                    sum -= nums[i];
                    i++;
                }
            }
            if( sum == target) {
                maxLen = Math.max(maxLen, j-i+1);
            }
            j++;
        }
        if(maxLen == Integer.MIN_VALUE) return -1;
        return n-maxLen;
    }
}
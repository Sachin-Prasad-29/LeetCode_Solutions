class Solution {
    public int searchInsert(int[] nums, int target) {
        int N = nums.length;
        if(target > nums[N-1]) return N;
        int start = 0 ; 
        int end = N-1;
        
        while(start < end ) {
            int mid = start + (end - start)/2;
            if(nums[mid] == target) return mid;
            if(nums[mid] > target) end = mid;
            else start = mid+ 1; 
        }
        return start;
    }
}
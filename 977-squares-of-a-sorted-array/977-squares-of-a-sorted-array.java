class Solution {
    public int[] sortedSquares(int[] nums) {
        int N = nums.length;
        int[] result = new int[N];
        int i= 0 , j = N-1;
        for(int k = N-1; k >= 0; k--){
            if(Math.abs(nums[i]) > Math.abs(nums[j])){
                 result[k] = (int)Math.pow(nums[i],2);
                i++;
            }else{
                result[k] = (int)Math.pow(nums[j],2);
                j--;
            }
        }
        return result;
    }
}
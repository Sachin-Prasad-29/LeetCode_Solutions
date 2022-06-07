class Solution {
    public int jump(int[] nums) {
       int i = 0;
        int j = 0;
        int ans = 0;
        while(j < nums.length-1){
            int farest = 0;
            for(int k = i; k <=j;k++ ){
                farest = Math.max(farest,k+nums[k]);
               
            }
            ans++;
            i = j+1;
            j = farest;
        }
        return ans;
    }
}
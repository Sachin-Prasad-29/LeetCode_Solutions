class Solution {
//     public int maxSubArray(int[] nums) {
//              if(nums.length == 1) return nums[0];
//             int grand_max = Integer.MIN_VALUE; ;
//             for(int i = 0 ; i < nums.length; i++){
//                 int curr_max= Integer.MIN_VALUE;
//                 int sum = 0 ;
//                 for(int j = i ; j < nums.length;j++){
//                     sum += nums[j];
//                      curr_max = Math.max(curr_max,sum);
//                 }
//                 grand_max= Math.max(curr_max,grand_max);
//             }

//         return grand_max;
//     }
    public int maxSubArray(int[] a){
        int curr_sum = 0 ;
        int max_sum = Integer.MIN_VALUE;
        for(int i = 0 ; i < a.length; i++){
            curr_sum += a[i];
            if(max_sum < curr_sum) 
                max_sum = curr_sum;
            if(curr_sum < 0 ) 
                curr_sum =0;
        }
        return max_sum;
        
    }
}
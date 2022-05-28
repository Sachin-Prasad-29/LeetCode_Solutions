class Solution {
    public int missingNumber(int[] nums) {
     int i = 0 ; 
        int N = nums.length;
    
     while(i < N){
         System.out.println(nums[i]);
         if(nums[i] == N){
             i++;
             continue;
         }
         else if( i != nums[i]){
             swap(nums, nums[i],i);
         }
         else
             i++;
     }
        
    for(int j = 0 ; j < N; j++)
        if(j != nums[j]) return j;
        
    return N;
    }
    private static void swap(int[] a, int right , int left){
        int temp = a[left];
        a[left] = a[right];
        a[right] = temp;
    }
}
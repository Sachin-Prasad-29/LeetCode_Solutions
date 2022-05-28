class Solution {
    public int missingNumber(int[] nums) {
        int i=0;
        while(i<nums.length){
            if(nums[i]==nums.length){
                i++;
                continue;
            }     
            else if(nums[i]!=i){
                swap(nums,nums[i],i);
                
            }  
            else
                i++;
        }
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=j)
                return j;
        }
        return nums.length;
    }
    public static void swap(int[] arr,int left,int right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
    }
}
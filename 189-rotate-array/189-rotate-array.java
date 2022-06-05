class Solution {
    public void rotate(int[] nums, int k) {
        if(nums.length <= 1)     return;
        k=k%nums.length;
        rotateArray(nums,0,nums.length-1);
        rotateArray(nums,0,k-1);
        rotateArray(nums,k,nums.length-1);
    }
    private static void rotateArray(int[] arr, int i , int j){
        while(i<j){
            int temp= arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
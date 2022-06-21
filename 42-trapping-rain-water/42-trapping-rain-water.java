class Solution {
    public int trap(int[] height) {
        int n = height.length;
        
        int[] max_Left = new int[n];
        int[] max_Right = new int[n];
        
        max_Left[0] = height[0];
        max_Right[n-1] = height[n-1];
        
        
        for(int i = 1 ;  i < n ; i++){
            max_Left[i] = Math.max(max_Left[i-1],height[i]);
            max_Right[n-i-1] = Math.max(max_Right[n-i],height[n-i-1]);
        }
        
        int result = 0;
        for(int i = 0 ; i < n; i++){
            result += Math.min(max_Left[i],max_Right[i])-height[i];
        }
        return result;
    }
}
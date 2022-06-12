class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int n = nums.length;
        int i = 0 ; 
        int j = 0 ;
        int cur_Sum = 0 ;
        int max_Sum = 0 ;
        HashMap<Integer,Integer> map = new HashMap<>();
        
        while(j < n){
            // add value in the hashmap 
            cur_Sum+= nums[j];
            map.put(nums[j],map.getOrDefault(nums[j],0)+1);
            
            // check for the size of the map 
            // if window size is equal to hashmap size
            if(map.size() == j-i+1){
                max_Sum = Math.max(max_Sum, cur_Sum);
            }
            // if window size is greater then the hashmap size
            if(map.size() < j-i+1){
                // increse the ith value and remove its nums[i] value form the sum until the window size become equal to the hashmap size
                while(map.size() < j-i+1){
                    map.put(nums[i],map.get(nums[i])-1);
                    cur_Sum -= nums[i];
                    if(map.get(nums[i]) == 0)
                        map.remove(nums[i]);
                    i++;
                }
            }
            j++;
        }
        return max_Sum;
    }
}
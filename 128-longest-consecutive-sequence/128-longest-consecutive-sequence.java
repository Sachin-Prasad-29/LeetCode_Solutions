class Solution {
    
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0 ; i < nums.length; i++){
            set.add(nums[i]);
        }
        int result = 1;
        for(int i = 0 ; i < nums.length;i++){
            if(set.contains(nums[i]-1)) continue;
            else{
                int curr_seq = 1; 
                int start = nums[i];
                while(set.contains(start+1)){
                    curr_seq++;
                    start++;
                }
               result = Math.max(result,curr_seq); 
            }
        }
        return result;
        
    }
//     public int longestConsecutive(int[] nums) {
//         if(nums.length == 0) return 0;
//         PriorityQueue<Integer> pq = new PriorityQueue<>();
        
//         for(int i = 0 ; i < nums.length; i++){
//             pq.offer(nums[i]);
//         }
        
//         int max_len = 1;
        
//         int curr_len = 1; 
//         int ele = pq.poll();
//         while(!pq.isEmpty()){
//             int val = pq.poll();
//             if(ele == val) continue;
//             if(ele == val -1){
                
//                 curr_len++;
//                 max_len = Math.max(max_len, curr_len);
                
//             }
//             else 
//                 curr_len= 1;
//             ele = val;
//         }
//         return max_len;
//     }
}
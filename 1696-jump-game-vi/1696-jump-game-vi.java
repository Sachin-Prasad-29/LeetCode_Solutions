class Solution {
    public int maxResult(int[] nums, int k) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        int n = nums.length;
        int[] dp = new int[n];
        dp[n-1] = nums[n-1];  // because we are definatly going to take its sum
        deque.offerFirst(n-1);
        
        for( int i = n-2; i >= 0 ; i--){
            if(deque.peekFirst() - i > k)
                deque.removeFirst();
            dp[i] = nums[i] + dp[deque.peekFirst()];
            while( !deque.isEmpty() && dp[deque.peekLast()] < dp[i]) 
                  deque.removeLast();
            deque.offerLast(i);
        }
        
        return dp[0];
    }
}
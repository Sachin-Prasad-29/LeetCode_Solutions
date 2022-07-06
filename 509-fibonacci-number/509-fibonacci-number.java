class Solution {
    public int fib(int n) {
        if(n <= 1) return n;
        
        int[] fib = new int[n+1];
        int prev_prev =0;
        int prev= 1;
        
        for(int i = 2; i < n+1 ; i++){
            fib[i] = prev_prev+ prev;
            prev_prev = prev;
            prev = fib[i];
        }
        return prev;
    
    }
}
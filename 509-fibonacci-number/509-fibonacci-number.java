class Solution {
    public int fib(int n) {
        if( n == 0 ) return 0;
        int prev = 1;
        int prePrev = 0 ; 
        for(int i = 2 ; i <= n ; i++){
            int curr = prev + prePrev;
            prePrev = prev;
            prev = curr;
        }
        return prev;
    }
}
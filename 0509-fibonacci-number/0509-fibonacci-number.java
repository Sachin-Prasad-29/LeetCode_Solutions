class Solution {
    public int fib(int n) {
        if(n <= 1) return n;
        int fib1  = 0;
        int fib2 = 1;
        for(int i = 2; i <= n ;i++){
            int curr = fib1+fib2;
            fib1 = fib2;
            fib2 = curr;
        }
        return fib2;
    }
}
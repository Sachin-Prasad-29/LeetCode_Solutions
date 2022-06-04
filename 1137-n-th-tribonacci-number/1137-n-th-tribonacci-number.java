class Solution {
    public int tribonacci(int n) {
        if(n <=1) return n;
        if(n == 2) return 1;
        int firstPrev = 1;
        int secondPrev = 1;
        int thirdPrev = 0;
        for(int i = 3; i <= n; i++){
            int curr = firstPrev + secondPrev + thirdPrev;
            thirdPrev = secondPrev;
            secondPrev = firstPrev;
            firstPrev = curr;
        }
        return firstPrev;
    }
}
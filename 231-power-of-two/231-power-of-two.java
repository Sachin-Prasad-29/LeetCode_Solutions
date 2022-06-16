class Solution {
    public boolean isPowerOfTwo(int n) {
        int ans = 0 ; 
        if(n <= 0) return false;
        for(int i = 0 ; i < 32; i++ ){
            if( (n & (1<<i)) != 0) ans++;
        }
        if( n >= 0 && ans == 1) return true;
        
        return false;
    }
}
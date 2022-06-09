class Solution {
    public int maxProduct(int[] a) {
        int n = a.length;
        int L = 0 ; 
        int R = 0;
        int res = Integer.MIN_VALUE;
        for(int i = 0 ; i < n ; i++){
             L = (L== 0 ? 1 :L) * a[i];
             R = (R== 0 ? 1 :R) * a[n-i-1];
            res = Math.max(res,Math.max(L,R));
        }
        return res;
    }
}
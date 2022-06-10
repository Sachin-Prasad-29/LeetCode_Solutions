class Solution {
    public int maxProfit(int[] a) {
       int  profit = 0 ; 
        int n = a.length;
        for(int i = 1 ; i < n ; i++){
            if(a[i] > a[i-1]){
                profit += a[i]- a[i-1];
            }
        }
        return profit;
    }
}
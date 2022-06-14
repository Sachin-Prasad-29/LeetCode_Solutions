class Solution {
    public int maxProfit(int[] a, int fee) {
        int[][] dp = new int[a.length+1][2];
        dp[a.length][0] = 0;
        dp[a.length][1] = 0;
        int aheadNotBuy = 0;
        int aheadBuy = 0;
        
        
        
        for(int i = a.length-1; i >= 0 ; i--){
            int currNotBuy = 0 ; 
            int currBuy = 0;
            for(int j = 1; j >= 0; j--){
               if(j == 1){
                   currBuy = Math.max(-a[i] + aheadNotBuy ,aheadBuy);
                }else{
                    currNotBuy = Math.max(a[i]-fee + aheadBuy ,aheadNotBuy);                   
                }
            }
            aheadBuy = currBuy;
            aheadNotBuy = currNotBuy;
        }
        return aheadBuy;
    }
}
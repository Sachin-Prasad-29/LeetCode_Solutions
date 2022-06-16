class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        int maxLen = 0;
        int start = 0, end = 0;
        int[][] dp = new int[n][n];
        for(int i = 0 ; i < n ; i++){
            for(int j = i; j <= i+1; j++){
                
                if(i == j) dp[i][j] = 1;
                else if(i < n-1){
                    if(i != j && s.charAt(i) == s.charAt(j)){
                        dp[i][j] = 2;
                        if(dp[i][j] > maxLen){
                        start = i;
                        end = j;
                        maxLen = dp[i][j];
                    }
                        
                    } 
                else 
                    dp[i][j] = 0;
                }
                
            }
        }
        
        for(int k = 2; k < n ; k++){
            int i = 0 ; int j = k;
            while(j < n){
                if(s.charAt(i) == s.charAt(j) && dp[i+1][j-1] != 0){
                    dp[i][j] = dp[i+1][j-1]+2;
                    if(dp[i][j] > maxLen){
                        start = i;
                        end = j;
                        maxLen = dp[i][j];
                    }
                }
                else{
                    dp[i][j] = 0;
                }
                i++;
                    j++;
            }
        }
        
        String ans = s.substring(start,end+1);
        return ans;
    }
}
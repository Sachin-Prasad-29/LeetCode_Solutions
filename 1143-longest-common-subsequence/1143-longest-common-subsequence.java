class Solution {
    // Recursive + Memoization (Top- down approach)
//     public int longestCommonSubsequence(String text1, String text2) {
//         int[][] t = new int[text1.length()+1][text2.length()+1];
//         for(int[] d : t)
//             Arrays.fill(d,-1);
//         return LCS_helper(text1, text2, text1.length(), text2.length(),t);
//     } 
//     private static int LCS_helper(String s1, String s2, int M, int N,int[][] t){
//         if(N == 0 || M == 0)
//             return 0;
//         if(t[M][N] != -1 ) 
//             return t[M][N];
        
//         if(s1.charAt(M-1) == s2.charAt(N-1)){
//             t[M][N] = 1+LCS_helper(s1,s2,M-1,N-1,t);
//             return t[M][N];
//         }
//         else {
 public int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length(), n = text2.length();
        if (m < n) {
            return longestCommonSubsequence(text2, text1);
        }
        int[] dp = new int[n + 1];
        for (int i = 0; i < text1.length(); ++i) {
            for (int j = 0, prevRow = 0, prevRowPrevCol = 0; j < text2.length(); ++j) {
                prevRowPrevCol = prevRow;
                prevRow = dp[j + 1];
                dp[j + 1] = text1.charAt(i) == text2.charAt(j) ? prevRowPrevCol + 1 : Math.max(dp[j], prevRow);
            }
        }
        return dp[n];
    }
}
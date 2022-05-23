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
//            t[M][N] = Math.max(LCS_helper(s1,s2,M-1,N,t), LCS_helper(s1,s2,M,N-1,t));
//            return t[M][N];
//         }
            
//     }
    
    // Second Approach Buttom up (Tabulation Approach)
    public int longestCommonSubsequence(String text1, String text2) {
        int M = text1.length();
        int N = text2.length();
        
        int[][] t = new int[M+1][N+1];
        // filling the whole matric with the -1 value
         for(int[] d : t)
             Arrays.fill(d,-1);
        
        // Initialization 
        for(int i = 0 ; i< M+1; i++)
            t[i][0] = 0;
        for(int i = 0; i< N+1; i++)
            t[0][i] = 0;
        
        for(int i = 1 ; i < M+1; i++)
            for(int j = 1; j < N+1; j++){
                if(text1.charAt(i-1) == text2.charAt(j-1)){
                    t[i][j] = t[i-1][j-1]+1;
                }
                else{
                    t[i][j] = Math.max(t[i][j-1],t[i-1][j]);
                }
            }
        
        return t[M][N];
    }
}
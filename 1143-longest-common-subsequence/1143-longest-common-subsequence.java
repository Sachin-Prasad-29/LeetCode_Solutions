class Solution {
    static int[][] t = new int[1001][1001];
    public int longestCommonSubsequence(String text1, String text2) {
        for(int[] d : t)
            Arrays.fill(d,-1);

        return LCS_helper(text1, text2, text1.length(), text2.length());
    } 
    private static int LCS_helper(String s1, String s2, int M, int N){
        if(N == 0 || M == 0)
            return 0;
        if(t[M][N] != -1 ) 
            return t[M][N];
        if(s1.charAt(M-1) == s2.charAt(N-1)){
            t[M][N] = 1+LCS_helper(s1,s2,M-1,N-1);
            return t[M][N];
        }
        else {
           t[M][N] = Math.max(LCS_helper(s1,s2,M-1,N), LCS_helper(s1,s2,M,N-1));
           return t[M][N];
        }
            
    }
}
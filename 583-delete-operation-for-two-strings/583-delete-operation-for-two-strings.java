class Solution {
    public int minDistance(String w1, String w2) {
        int M = w1.length();
        int N = w2.length();
        
        int[][] t = new int[M+1][N+1];
        
        // initialization
        for(int[] a : t){
            Arrays.fill(a,-1);
        }
        for(int i = 0;i < M+1; i++)
            t[i][0] = 0;
        for(int i = 0 ; i < N+1; i++)
            t[0][i] = 0;
        
        // Iteration process
        for(int i = 1; i < M+1; i++)
            for(int j = 1; j < N+1; j++){
                if(w1.charAt(i-1) == w2.charAt(j-1))
                    t[i][j] = 1+ t[i-1][j-1];
                else
                    t[i][j] = Math.max(t[i-1][j],t[i][j-1]);
            }
        int ans = M - t[M][N];
        ans += N- t[M][N];
        return ans;
        
    }
}
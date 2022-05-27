class Solution {
    public int minInsertions(String s) {
        int M = s.length();
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        String b = sb.reverse().toString();
        System.out.println(b);
        int[][] t = new int[M+1][M+1];
        
        for(int i = 1; i< M+1; i++)
            for(int j = 1; j < M+1; j++){
                if(s.charAt(i-1) == b.charAt(j-1))
                    t[i][j] = 1+ t[i-1][j-1];
                else
                    t[i][j] = Math.max(t[i-1][j], t[i][j-1]);
            }
        return M-t[M][M];
    }
}
class Solution {
    public String shortestCommonSupersequence(String s1, String s2) {
        int M = s1.length();
        int N = s2.length();
        
        int[][] t = new int[M+1][N+1];
        
        for(int i = 0; i< M+1; i++){
            for(int j = 0 ; j < N+1 ; j++){
                if(i == 0)
                    t[i][j] = j;
                else if( j == 0)
                    t[i][j] = i;
                else if(s1.charAt(i-1) == s2.charAt(j-1))
                    t[i][j] = 1+ t[i-1][j-1];
                else
                    t[i][j] = 1+ Math.min(t[i-1][j], t[i][j-1]);
            }
        }
        
        int i = M;
        int j = N;
        StringBuilder sb = new StringBuilder();
        while(i > 0 && j > 0){
            System.out.println(i+" "+j+ " "+ sb.toString());
            if(s1.charAt(i-1) == s2.charAt(j-1)){
                sb.append(s1.charAt(i-1));
                i--;
                j--;
            }
            else{
                if(t[i-1][j] < t[i][j-1]){
                    sb.append(s1.charAt(i-1));
                    i--;
                }
                else{
                    sb.append(s2.charAt(j-1));
                    j--;
                }
            }
        }
        if(i > 0){
            while(i > 0){
                sb.append(s1.charAt(i-1));
                i--;
            }
        }
        if(j > 0){
            while(j > 0){
                sb.append(s2.charAt(j-1));
                j--;
            }
        }
        System.out.println(sb.toString());
        return sb.reverse().toString();
    }
}





// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            String S = in.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.countWays(N, S));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution{
    static int mod = 1003;
    static int[][][] dp;
    static int countWays(int N, String S){
        dp = new int[N+1][N+1][2];
        for(int[][] d : dp){
            for(int[] t : d)
                Arrays.fill(t,-1);
        }
        return BooleanPara(S,0,N-1,1);
    }
    private static int BooleanPara(String S, int i , int j , int  isTrue){
        // Base conditions
        if(i > j) return 0;
        if(i== j ){
            if(isTrue == 1){
                if(S.charAt(i) == 'T') return 1;
                else  return 0;
            }
            else if(isTrue == 0){
                if(S.charAt(i) == 'F') return 1;
                else return 0;
            }
        }
        if( dp[i][j][isTrue] != -1) return dp[i][j][isTrue];
        int ans = 0; 
        for(int k = i+1;k < j; k=k+2){
            int LT = BooleanPara(S,i,k-1,1);
            int LF = BooleanPara(S,i,k-1,0);
            int RT = BooleanPara(S,k+1,j,1);
            int RF = BooleanPara(S,k+1,j,0);
            
            if(S.charAt(k) == '&'){
                if(isTrue == 1)
                    ans = (ans + (LT*RT)%mod)%mod;
                else
                    ans = (ans + (LT*RF)%mod + (LF*RT)%mod + (LF*RF)%mod)%mod ;
            }
            if(S.charAt(k) == '|'){
                if(isTrue == 1)
                    ans = (ans + (LT*RT)%mod + (LT*RF)%mod + (LF*RT)%mod)%mod;
                else
                    ans = (ans + (LF*RF)%mod)%mod ;
            }
            if(S.charAt(k) == '^'){
                if(isTrue == 1 )
                    ans = (ans + (LT*RF)%mod +(LF*RT)%mod)%mod;
                else
                    ans = (ans + (LF*RF)%mod + (LT*RT)%mod)%mod ;
            }
        }
         dp[i][j][isTrue] =ans%mod;
         return ans%mod;
    }
}





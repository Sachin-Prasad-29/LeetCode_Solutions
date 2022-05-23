// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String input[] = read.readLine().trim().split(" ");
            int n = Integer.parseInt(input[0]);
            int m = Integer.parseInt(input[1]);
            
            String S1 = read.readLine().trim();
            String S2 = read.readLine().trim();

            Solution ob = new Solution();
            System.out.println(ob.longestCommonSubstr(S1, S2, n, m));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution{
    int longestCommonSubstr(String text1, String text2, int M, int N){
//         int[][] t = new int[n+1][m+1];
//         for(int[] d : t)
//             Arrays.fill(d,-1);
        
//         LCSubstring(S1,S2,n,m,t);
//         int maxval = 0;
//         for(int[] d : t)
//           for(int i : d)
//               maxval =  Math.max(maxval,i);
        
//         return maxval;
//     }
//   private static int LCSubstring(String s1, String s2, int M, int N , int[][] t){
//         if(M == 0 || N == 0)
//             return 0;
//         if(t[M-1][N-1] == -1)
//           return t[M][N];
//         if(s1.charAt(M-1) == s2.charAt(N-1)){
//             t[M][N] = 1+ LCSubstring(s1,s2,M-1,N-1,t);
//             return t[M][N];
//         }
//         else{
//             t[M][N] = 0;
//             return t[M][N];
//         }

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
                    t[i][j] = 0;
                }
            }
        
     int maxval = 0;
         for(int[] d : t)
           for(int i : d)
              maxval =  Math.max(maxval,i);
        
        return maxval;
    }
}
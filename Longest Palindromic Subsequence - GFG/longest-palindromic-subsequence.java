// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String s = sc.next();
                    Solution obj = new Solution();
                    System.out.println(obj.longestPalinSubseq(s));
                }
                
        }
}// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int longestPalinSubseq(String S)
    {
        int M = S.length();
        StringBuilder  sb = new StringBuilder();
        sb.append(S);
        String R = sb.reverse().toString();
        
        int[][] t = new int[M+1][M+1];
        
        // fill the array with -1
        
        for(int[] d : t)
            Arrays.fill(d,-1);
    
        // Initilization
        
        for(int i = 0 ; i < M+1; i++)
            t[i][0] = 0;
        for(int i = 0 ; i < M+1; i++)
            t[0][i] = 0;
            
        for(int i = 1; i< M+1; i++)
           for(int j = 1; j < M+1; j++){
               if(S.charAt(i-1) == R.charAt(j-1)){
                   t[i][j] = t[i-1][j-1] + 1;
               }else{
                   t[i][j] = Math.max(t[i-1][j] , t[i][j-1]);
               }
           }
           return t[M][M];
    }
}
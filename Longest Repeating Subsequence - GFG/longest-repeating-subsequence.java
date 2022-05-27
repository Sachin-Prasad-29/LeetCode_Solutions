// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String str = br.readLine().trim();
            Solution ob = new Solution();
            int ans = ob.LongestRepeatingSubsequence(str);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int LongestRepeatingSubsequence(String s)
    {
        int M = s.length();
        
         int[][] t = new int[M+1][M+1];
         
         // buttom up approach 
         for(int i = 1; i< M+1;i++){
             for(int j = 1; j < M+1; j++){
                 if(s.charAt(i-1)== s.charAt(j-1) && i != j){
                     t[i][j] = 1+ t[i-1][j-1];
                 }
                 else{
                     t[i][j] = Math.max( t[i-1][j] , t[i][j-1]);
                 }
             }
         }
         
         return t[M][M];
        
    }
}
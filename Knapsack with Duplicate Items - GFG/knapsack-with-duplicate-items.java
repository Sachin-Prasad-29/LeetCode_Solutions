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
            String line1[] = in.readLine().trim().split("\\s+");
            int N = Integer.parseInt(line1[0]);
            int W = Integer.parseInt(line1[1]);
            String line2[] = in.readLine().trim().split("\\s+");
            int val[] = new int[N];
            for(int i = 0;i < N;i++)
                val[i] = Integer.parseInt(line2[i]);
            String line3[] = in.readLine().trim().split("\\s+");
            int wt[] = new int[N];
            for(int i = 0;i < N;i++)
                wt[i] = Integer.parseInt(line3[i]);
                
            Solution ob = new Solution();
            System.out.println(ob.knapSack(N, W, val, wt));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution{
    // Recursive Code TLE 
//     static int knapSack(int N, int W, int val[], int wt[])
//     {
//         // code here
//         return findMaxProfit(N,W,val,wt);
//     }
//     private static int findMaxProfit(int index, int W, int[] val, int[] wt){
//         // base condition
//         if(index == 0 || W == 0)
//             return 0;
//         if(wt[index-1] <= W){
//             int Result1 = Math.max(val[index-1] + findMaxProfit(index,W-wt[index-1], val, wt), findMaxProfit(index-1, W, val, wt));
//             return Result1;
//         }
//         else{
//             int Result2 = findMaxProfit(index -1, W, val, wt);
//             return Result2;
//         }
//     }
// }


// Recursive + Memization approach
// static int knapSack(int N, int W, int val[], int wt[])
//     {
//         // code here
//         int[][] dp = new int[1001][1001];
//         // filling the dp array with -1 value
//         for(int[] d : dp)
//             Arrays.fill(d,-1);
//         return findMaxProfit(N,W,val,wt,dp);
//     }
//     private static int findMaxProfit(int index, int W, int[] val, int[] wt,int[][] dp){
//         // base condition
//         if(index == 0 || W == 0)
//             return 0;
//         if(dp[index][W] != -1) return dp[index][W];
//         if(wt[index-1] <= W){
//             dp[index][W]= Math.max(val[index-1] + findMaxProfit(index,W-wt[index-1], val, wt,dp), findMaxProfit(index-1, W, val, wt,dp));
//             return dp[index][W];
//         }
//         else{
//             dp[index][W] = findMaxProfit(index -1, W, val, wt,dp);
//             return dp[index][W];
//         }
//     }
// }

// Tabulation  ( Buttom up approach)
   static int knapSack(int N, int W, int val[], int wt[]){
    
         int[][] dp = new int[N+1][W+1];
         // Initialization first row and first should be Zero int the matrix  but not needed int the Java as its alredy Zero 
    
         return findMaxProfit(N,W,val,wt,dp);
  }
   private static int findMaxProfit(int N, int W, int[] val, int[] wt,int[][] dp){
       for(int i =1; i < N+1; i++){
           for(int j = 1; j < W+1; j++){
               if(wt[i-1] <= j){
                   dp[i][j] = Math.max(val[i-1]+dp[i][j-wt[i-1]] , dp[i-1][j]);
               }
               else
                    dp[i][j] = dp[i-1][j];
           }
       }
       
       return dp[N][W];
   }

}








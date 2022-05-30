// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            String input_line[] = in.readLine().trim().split("\\s+");
            int arr[]= new int[N];
            for(int i = 0; i < N; i++)
                arr[i] = Integer.parseInt(input_line[i]);
            
            Solution ob = new Solution();
            System.out.println(ob.matrixMultiplication(N, arr));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int[][] dp ;
    static int matrixMultiplication(int N, int arr[])
    {   
        dp = new int[N+1][N+1];
        for(int[] d: dp)
            Arrays.fill(d,-1);
            
        return MCM(arr,1,N-1);
    }
    private static int MCM(int[] arr, int start, int end){
        if(start >= end) return 0;
        
        if(dp[start][end] != -1) return dp[start][end];
        int Cost = Integer.MAX_VALUE;
        
        for(int k =start; k < end ; k++){
            int tempCost = MCM(arr, start, k)+MCM(arr, k+1, end)+ arr[start-1]*arr[k]*arr[end];
            Cost = Math.min(Cost,tempCost);
        }
        dp[start][end] = Cost;
         return Cost;
    }
}
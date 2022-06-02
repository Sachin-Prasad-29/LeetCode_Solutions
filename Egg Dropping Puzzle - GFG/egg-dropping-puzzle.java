// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GfG { 
    
	public static void main (String[] args) throws IOException  {
	    
	    //reading input using BufferedReader class
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//reading total testcases
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    
		    //reading number of eggs and floors
		    String inputLine[] = br.readLine().trim().split(" ");
		    
		    int n = Integer.parseInt(inputLine[0]);
		    int k = Integer.parseInt(inputLine[1]);
		    
		    //calling eggDrop() method of class
		    //EggDrop
		    System.out.println(new Solution().eggDrop(n, k));
		}
	}
}


// } Driver Code Ends


class Solution 
{    
     
    //Function to find minimum number of attempts needed in 
    //order to find the critical floor.
    static int eggDrop(int n, int k) 
	{
	    int[][] dp = new int[n+2][k+2];
	    for(int[] d: dp)
	        Arrays.fill(d,-1);
	    return helper(n,k,dp);
	    
	}
	private static int helper(int n, int k,int[][] dp){
	    if( k == 1 || k == 0) return k;
	    if(n == 1) return k;
	    if(dp[n][k] != -1) return dp[n][k];
	    int ans = Integer.MAX_VALUE;
	    
	    for(int i  =1 ; i<= k; i++){
	        int case1;
	        int case2;
	        if(dp[n-1][i-1] != -1){
	            case1 = dp[n-1][i-1];
	        }
	        else{
	            dp[n-1][i-1] = helper(n-1,i-1,dp);
	            case1 = dp[n-1][i-1];
	        }
	        
	        if(dp[n][k-i] != -1){
	            case2 = dp[n][k-i];
	        }
	        else{
	           dp[n][k-i] = helper(n,k-i,dp);
	            case2 = dp[n][k-i];
	        }
	        
	        int temp = 1+ Math.max(case1,case2);
	        ans = Math.min(ans,temp);
	    }
	   dp[n][k] = ans;
	   return ans;
	}
}
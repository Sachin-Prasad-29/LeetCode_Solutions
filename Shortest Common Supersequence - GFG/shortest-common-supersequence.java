// { Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
	    
	    //taking input using Scanner class
		Scanner sc=new Scanner(System.in);
		
		//taking total testcases
		int t=sc.nextInt();
		
		sc.nextLine();
		while(t-->0)
		{
		   //taking String X and Y
		   String S[]=sc.nextLine().split(" ");
		   String X=S[0];
		   String Y=S[1];
		   
		   //calling function shortestCommonSupersequence()
		   System.out.println(new Solution().shortestCommonSupersequence(X, Y, X.length(), Y.length()));
		}
	}




       
}// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to find length of shortest common supersequence of two strings.
    public static int shortestCommonSupersequence(String X,String Y,int m,int n)
    {
        int[][] t = new int[m+1][n+1];
        
        for(int[] d : t)
            Arrays.fill(d,-1);
        
        // Initialization
        for(int i = 0 ; i < m+1 ; i++)
            t[i][0] = 0;
        for(int i = 0; i < n+1; i++)
            t[0][i] = 0;
        
        // Iteration process
        for(int i = 1; i < m+1; i++){
            for(int j = 1; j < n+1; j++){
                if(X.charAt(i-1) == Y.charAt(j-1)){
                    t[i][j] = 1 + t[i-1][j-1];
                }
                else{
                    t[i][j] = Math.max(t[i-1][j],t[i][j-1]);
                }
            }
        }
        return m+n-t[m][n];
    }
}
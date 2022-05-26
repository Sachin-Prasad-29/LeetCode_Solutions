// { Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0){
            int n = Integer.parseInt(read.readLine());
            String str = read.readLine().strip();
            Solution ob = new Solution();
            long ans = ob.minDeletions(str, n); 
            System.out.println(ans);
        }
    } 
} // } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    int minDeletions(String S, int M)
    {
       
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
            
        // Buttom up approach 
        for(int i = 1; i < M+1 ; i++)
            for(int j = 1; j < M+1 ; j++){
                if(S.charAt(i-1) == R.charAt(j-1))  
                    t[i][j] = t[i-1][j-1]+1;
                else
                    t[i][j] = Math.max(t[i-1][j], t[i][j-1]);
            }
            
            return M - t[M][M];
    }
} 







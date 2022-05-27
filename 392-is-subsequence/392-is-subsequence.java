class Solution {
    public boolean isSubsequence(String s, String t) {
        int M = s.length();
        int N = t.length();
        
        return helper(s,t,M,N);
    }
    private static boolean helper(String s, String t, int i , int j){
        if(i == 0 || j == 0){
            if(i == 0) return true;
            return false;
        }
        if(s.charAt(i-1) == t.charAt(j-1)){
            return helper(s,t,i-1,j-1);
        }
        else 
            return helper(s,t,i,j-1);
    }
}
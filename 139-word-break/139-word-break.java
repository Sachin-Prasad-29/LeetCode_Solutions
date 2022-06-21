class Solution {
    static int[] dp ;
    public boolean wordBreak(String s, List<String> wordDict) {
        HashSet<String> set = new HashSet<>();
        
        for(int i = 0 ; i < wordDict.size() ;i++){
            set.add(wordDict.get(i));
        }
        int n = s.length(); 
        dp = new int[n];
        Arrays.fill(dp,-1);
        if(helper(0,set,s) == 1) return true;
        return false;
    }
    private static int helper(int index, HashSet<String> set,String s){
        if(index == s.length()) return 1;
        if(dp[index] != -1) return dp[index];
        for(int i = index+1; i <=s.length() ; i++){
            String str = s.substring(index,i);
            if(set.contains(str) && (helper(i,set,s) == 1)) return dp[index] =  1;
        }
        return dp[index] = 0;
    }
}
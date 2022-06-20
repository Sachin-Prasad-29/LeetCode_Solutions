class Solution {
    public int minimumLengthEncoding(String[] words) {
      HashSet<String> set = new HashSet<>();
        for(String s :words)
            set.add(s);
        for(String s: words){
            for(int i = 1; i <= s.length(); i++){
                set.remove(s.substring(i));
            }
        }
        int ans = 0 ; 
        for(String s: set){
            ans += s.length()+1;    
        }
        return ans;
    }
}
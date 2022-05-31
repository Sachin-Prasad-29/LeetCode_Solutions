class Solution {
    public boolean hasAllCodes(String s, int k) {
        int N = s.length();
        int combi = (int)Math.pow(2,k);
        int start=0, end = 0;
        HashSet<String> set = new HashSet<>();
        
        while(end <  N){
            if(end - start +1 < k){
                end++;
                continue;
            }
            else if( end - start+1 == k){
                
                String temp = s.substring(start,end+1);
                set.add(temp);
                if(set.size() == combi) return true;
                start++;
                end++;
            }
        }
        if(set.size() == combi) return true;
        return false;
    }
}
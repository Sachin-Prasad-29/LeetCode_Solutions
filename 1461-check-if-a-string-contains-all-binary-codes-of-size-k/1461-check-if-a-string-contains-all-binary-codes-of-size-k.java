class Solution {
    public boolean hasAllCodes(String s, int k) {
        
        // Storing the maximum possible combination with k digit 
        int combi = (int)Math.pow(2,k);
        
        // initilaizing the starting and End pointer
        int start=0, end = k-1;
        
        HashSet<String> set = new HashSet<>();
        
        while(end <  s.length()){
                 String temp = s.substring(start,end+1);
                // insert the substring of size k in the set 
                set.add(temp);
                // check wheather the size of the set is equal to the requied combination or not 
                if(set.size() == combi) return true;
                start++;
                end++;
        }
        // if the set size is not equal to the combination return false;
        return false;
    }
}
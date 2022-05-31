class Solution {
    public boolean hasAllCodes(String s, int k) {
        int N = s.length();
        // Storing the maximum possible combination with k digit 
        int combi = (int)Math.pow(2,k);
        
        // initilaizing the starting and End pointer
        int start=0, end = 0;
        
        HashSet<String> set = new HashSet<>();
        
        while(end <  N){
            // untill we reach the window size of k increase the end value only
            if(end - start +1 < k){
                end++;
                continue;
            }
            // if size of the window is equal to the k 
            else if( end - start+1 == k){
                 String temp = s.substring(start,end+1);
                // insert the substring of size k in the set 
                set.add(temp);
                // check wheather the size of the set is equal to the requied combination or not 
                if(set.size() == combi) return true;
                start++;
                end++;
            }
        }
        // if the set size is not equal to the combination return false;
        return false;
    }
}
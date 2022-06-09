class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        HashMap<Character,Integer> map = new HashMap<>();
        int i  = 0, j = 0;
        int max_Size = 0 ;
        while(j < n){
            // adding the character into the hashmap
            map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1);
            
            if(map.size() == j-i+1){
                max_Size = Math.max(max_Size,map.size());
            }
            else if(map.size() < j-i+1){
                while(map.size() != j-i+1){
                    map.put(s.charAt(i),map.get(s.charAt(i))-1);
                if(map.get(s.charAt(i)) == 0){
                    map.remove(s.charAt(i)); 
                }   
               i++;
            }
                
            }
            j++;
        }
        return max_Size;
        
    }
}
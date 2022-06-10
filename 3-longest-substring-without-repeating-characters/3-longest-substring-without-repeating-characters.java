/* 
Sliding window Using HashMap
-->So this is the variation of variable sliding window.
Here we are using Hashmap to store the reapetation of every character for the given window size.
-->So lets suppose the window contain "a b c d" then the window size will be 4 + hashmap size will be also 4 & if window contain "a c b a" then the window size will 4 but hashmap size will be 3 because 'a' is repeated so this is invalid answer.
-->So we will use same approach here if window size and size of hashmap is Same then we check for the answer.
-->And if any window size become greater then hashmap size then we shif the window until repeated character is get removed form the element.
*/

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        HashMap<Character,Integer> map = new HashMap<>();
        // Initilizing the window size zero before starting
        int i  = 0, j = 0;
        int max_Size = 0 ; // to store the maximum length
        
        while(j < n){
            // adding the character into the hashmap set by set 
            map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1);
            
            // if the size of our window and size of our hashmap is same then all are distint elements
            if(map.size() == j-i+1){
                max_Size = Math.max(max_Size,map.size());
            }
            // if any repeatation happen we clear the hashmap and decrease the window until it will again contain only unique characters
            else if(map.size() < j-i+1){
                while(map.size() != j-i+1){
                    map.put(s.charAt(i),map.get(s.charAt(i))-1);
                if(map.get(s.charAt(i)) == 0){
                    map.remove(s.charAt(i)); 
                }   
               i++; // decrease the window size
            }   
            }
            j++; // increase the window size again
        }
        return max_Size;
        
    }
}
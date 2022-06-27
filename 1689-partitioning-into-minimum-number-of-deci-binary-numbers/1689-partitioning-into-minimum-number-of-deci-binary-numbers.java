class Solution {
    public int minPartitions(String n) {
     // find the largest char number int the string and return that value;
     int result = 0 ; 
     
     for(char ch : n.toCharArray()){
         if((ch-'0') == 9 ) return 9;
         result = Math.max(result, (ch-'0'));
     }
        return result;
    }
}
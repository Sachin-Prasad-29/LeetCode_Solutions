class Solution {
    public int removePalindromeSub(String s) {
      int n = s.length();
      if(n == 0 || n == 1) return n;
      if(n > 1 && isPallindrone(s))  return 1;
      return 2;
    }
    private static boolean isPallindrone(String s){
        int i = 0 ; 
        int j = s.length()-1;
        while(i < j){
            if(s.charAt(i) != s.charAt(j)) return false;
            i++ ; j-- ;
            
        }
        return true;
    }
}
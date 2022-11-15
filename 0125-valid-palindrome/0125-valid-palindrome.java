class Solution {
    public boolean isPalindrome(String s) {
        int i = 0 ;
        int j = s.length()-1;
        while(i < j){
            
            char a = Character.toLowerCase(s.charAt(i));
            char b = Character.toLowerCase(s.charAt(j));
            
          

            if(!Character.isLetterOrDigit(a)){
                i++;
            }else if(!Character.isLetterOrDigit(b)){
                j--;
            }else if(Character.compare(a,b) != 0){
                return false;
            
            }else{

                i++; j--;
            }
           
        }
        return true;
    }
}
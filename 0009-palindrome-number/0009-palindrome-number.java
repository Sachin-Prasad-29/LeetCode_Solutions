class Solution {
    public boolean isPalindrome(int x) {
        String res = x+"";
        System.out.println(res);
        int i = 0 , j = res.length()-1;
        
        while(i < j){
            char a = res.charAt(i);
            char b = res.charAt(j);
            if( Character.compare(a, b) != 0  ){
                return false;
            }
            i++;
            j--;
        }
        
        return true;
    }
}
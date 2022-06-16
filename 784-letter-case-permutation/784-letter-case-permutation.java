class Solution {
    public List<String> letterCasePermutation(String s) {
       List<String> ans = new ArrayList<>();
       char[] ch = new char[s.length()];
       getAllCombination(ans,s,ch,0);
        return ans;
    }
    private static void getAllCombination(List<String> ans, String s,char[] ch, int index ){
        if( index == s.length()){
            ans.add(new String(ch));
            return ;
        }
        if(s.charAt(index) >= '0' && s.charAt(index) <= '9'){
            ch[index] = s.charAt(index);
            getAllCombination(ans,s,ch,index+1);
        }
        else if( s.charAt(index) >= 'A' && s.charAt(index) <='Z'){
            ch[index] = s.charAt(index);
            getAllCombination(ans,s,ch,index+1);
            ch[index] = (char)(s.charAt(index)+32);
            getAllCombination(ans,s,ch,index+1);            
        }
        else{
            ch[index] = s.charAt(index);
            getAllCombination(ans,s,ch,index+1);
            ch[index] = (char)(s.charAt(index)-32);
            getAllCombination(ans,s,ch,index+1); 
        }
    }
    
}





class Solution {
    public String reverseWords(String s) {
        char[] st = s.toCharArray();
        int N = st.length;
        int i = 0 ; 
        int j = 0 ;
        while(j < N){
            if(st[j] == ' ') {
                ReverseString(st,i,j-1);
                i = j+1;
            }
            j++;
        }
        ReverseString(st,i,j-1);
        return new String(st);
        
    }
    private static void ReverseString(char[] st,int i , int j){
            while(i < j){
                char temp = st[i];
                st[i] = st[j];
                st[j] = temp;
                i++; j--;
            }
    }
}